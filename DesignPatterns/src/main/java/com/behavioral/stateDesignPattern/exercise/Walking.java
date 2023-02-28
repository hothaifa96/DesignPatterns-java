package com.behavioral.stateDesignPattern.exercise;

public class Walking implements TravelMode {
    @Override
    public int calculateETA() {
        return 50;
    }

    @Override
    public void getDirections() {
        System.out.println("Spotify is on ");
    }
}
