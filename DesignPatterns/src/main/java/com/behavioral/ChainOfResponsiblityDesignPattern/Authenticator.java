package com.behavioral.ChainOfResponsiblityDesignPattern;

public class Authenticator extends Handler{

    public Authenticator (Handler next){
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("authenticating");
        return !(request.getUsername().equals("nadav") && request.getPassword().equals("123"));
    }
}
