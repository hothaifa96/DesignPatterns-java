package com.structurlas.AdapterDesignPattern.Exercise;

public class rProtocoleAdapter implements Protocole{
    private Http http;

    public rProtocoleAdapter(Http http) {
        this.http = http;
    }

    @Override
    public void sendEmail(Mail mail) {
        http.handle(mail);
    }
}
