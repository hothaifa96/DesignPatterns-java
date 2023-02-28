package com.intro.abstraction;

public class MailService {
    public  void sendEmail(){
        connect();
        authenticate();
        //sending email
        disconnect();
    }

    private void connect (){
        System.out.println("Connect ");
    }
    private void disconnect (){
        System.out.println("Disconnect ");
    }
    private void authenticate (){
        System.out.println("authentication ");
    }



}
