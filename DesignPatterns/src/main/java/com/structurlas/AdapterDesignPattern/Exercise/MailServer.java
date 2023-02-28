package com.structurlas.AdapterDesignPattern.Exercise;

public class MailServer {
    private Mail mail;

    public MailServer(Mail mail) {
        this.mail = mail;
    }

    public Mail getMail() {
        return mail;
    }

    public void send (Protocole protocole){
        protocole.sendEmail(mail);
    }
}
