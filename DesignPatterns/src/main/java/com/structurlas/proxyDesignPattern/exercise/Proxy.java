package com.structurlas.proxyDesignPattern.exercise;


public class Proxy implements Internet{
    private String URL;
    private Internet internet;

    public Proxy(String URL) {
        this.URL = URL;
    }

    @Override
    public void connectTo() {
        if (internet == null) {
            internet = new RealURl(URL);
        }
        System.out.println("connected to "+ URL);
    }

    @Override
    public String getUrl() {
        return URL;
    }
}
