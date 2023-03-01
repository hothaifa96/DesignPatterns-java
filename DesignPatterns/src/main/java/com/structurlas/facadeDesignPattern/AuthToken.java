package com.structurlas.facadeDesignPattern;

public class AuthToken {
    private String appId;
    private String key;
    public AuthToken(String appId, String key) {
        this.appId=appId;
        this.key= key;
    }
}
