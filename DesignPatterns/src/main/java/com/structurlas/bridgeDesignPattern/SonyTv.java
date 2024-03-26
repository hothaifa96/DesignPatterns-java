package com.structurlas.bridgeDesignPattern;

public class SonyTv implements Device{
    @Override
    public void turnOn() {
        System.out.println("Sony: ON");
    }

    @Override
    public void turnoff() {
        System.out.println("Sony: Off");
    }

    @Override
    public void switchChannel() {
        System.out.println("Sony: switching channel");
    }
}
