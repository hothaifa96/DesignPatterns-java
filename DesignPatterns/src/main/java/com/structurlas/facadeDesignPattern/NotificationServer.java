package com.structurlas.facadeDesignPattern;



public class NotificationServer {
    public Connection connect(String ipAdress){
        // logic
        return new Connection();
    }

    public AuthToken authenticate(String appId, String key){
        return new AuthToken(appId,key);
    }

    public void send(AuthToken authToken,Message message,String target){
        System.out.println("sending ggg g g g g g g");
    }

}
