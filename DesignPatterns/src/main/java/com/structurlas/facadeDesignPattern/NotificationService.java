package com.structurlas.facadeDesignPattern;

public class NotificationService {
    public void send(String message , String target){
        var server = new NotificationServer();
        var connection = server.connect("127.0.0.1");
        var token = server.authenticate("111","mama maglione");
        server.send(token,new Message(message),"target");
        connection.disconnect();
    }
}
