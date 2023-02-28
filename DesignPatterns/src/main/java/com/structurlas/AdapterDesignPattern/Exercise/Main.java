package com.structurlas.AdapterDesignPattern.Exercise;

public class Main {
    public static void main(String[] args) {

        var mail = new Mail("hodi","baraak","how are you ?");
        var mailServer = new MailServer(mail);
        mailServer.send(new rProtocoleAdapter(new Http()));


    }
}
