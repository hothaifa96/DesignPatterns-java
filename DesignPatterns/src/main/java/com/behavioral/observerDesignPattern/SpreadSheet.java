package com.behavioral.observerDesignPattern;

public class SpreadSheet implements Observer{
    @Override
    public void update() {
        System.out.println("spread sheet notified");
    }
}
