package com.structurlas.facadeDesignPattern;

public class Main {
    public static void main(String[] args) {
        // message content class
        // server -> class
            // Connection.connect(target) - class
            // auth -> token
            // send -> toekn message target
            // Connection.disconnect)_

        var service = new NotificationService();
        service.send("joey doesnt share food","joey");

    }
}
