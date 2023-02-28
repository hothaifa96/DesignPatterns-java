package com.ChainOfResponsiblityDesignPattern;

public class Main {
    public static void main(String[] args) {
        var request = new HttpRequest("nadav","1223");
        var compressor = new Compressor(null);
        //var logger = new Logger(compressor);
        var authenticator = new Authenticator(compressor);
        var server = new WebServer(authenticator);
        server.handle(request);

    }
}
