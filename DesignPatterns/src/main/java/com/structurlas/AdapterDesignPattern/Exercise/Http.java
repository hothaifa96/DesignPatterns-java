package com.structurlas.AdapterDesignPattern.Exercise;

public class Http {
    public void init(int port ){
        System.out.println(port);
    }

    public void handle(Mail mail){
        System.out.println("sending the maile to "+mail.getTo() );
    }
}
