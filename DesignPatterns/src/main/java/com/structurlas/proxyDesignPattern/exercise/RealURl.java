package com.structurlas.proxyDesignPattern.exercise;

public class RealURl implements Internet{
    private String URL;

    public RealURl(String URL) {
        this.URL = URL;
    }

    @Override
    public void connectTo() {
        System.out.println("connected to "+URL);
    }

    private void add(){
        System.out.println("preparing "+URL);
    }

    @Override
    public String getUrl() {
        return null;
    }
}
