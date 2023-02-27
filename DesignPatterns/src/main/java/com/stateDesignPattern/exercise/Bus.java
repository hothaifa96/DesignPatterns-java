package com.stateDesignPattern.exercise;

public class Bus implements TravelMode {
    @Override
    public int calculateETA() {
        return 10;
    }

    @Override
    public void getDirections() {
        System.out.println("moovit is on");
    }
}
