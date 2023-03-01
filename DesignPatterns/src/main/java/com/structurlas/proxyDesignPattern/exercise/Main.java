package com.structurlas.proxyDesignPattern.exercise;

public class Main {
    // build internet demo system using the proxy pateern

    public static void main(String[] args) {
        var server = new NetService();
        server.addSite("google.com");
        server.addSite( "draw.io");
        server.connectTo("google.com");
        server.connectTo("youtube.com");  // not exist ->  connecting -> connected
        server.connectTo("draw.io");

    }

}
