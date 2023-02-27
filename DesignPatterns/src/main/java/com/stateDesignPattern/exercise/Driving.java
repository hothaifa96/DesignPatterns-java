package com.stateDesignPattern.exercise;

public class Driving implements TravelMode {
    @Override
    public int calculateETA() {
        return 1;
    }

    @Override
    public void getDirections() {
        System.out.println("waze is on ");
    }
}
