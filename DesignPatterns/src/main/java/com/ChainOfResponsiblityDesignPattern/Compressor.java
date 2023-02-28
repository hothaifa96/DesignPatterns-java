package com.ChainOfResponsiblityDesignPattern;

public class Compressor extends Handler {
    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Compressing .....");
        return false;
    }

    public Compressor(Handler next) {
        super(next);
    }
}
