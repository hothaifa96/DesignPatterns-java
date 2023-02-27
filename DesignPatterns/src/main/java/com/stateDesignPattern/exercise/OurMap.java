package com.stateDesignPattern.exercise;

public class OurMap {
    private TravelMode travelMode;

    public TravelMode getTravelMode() {
        return travelMode;
    }

    public void setTravelMode(TravelMode travelMode) {
        this.travelMode = travelMode;
    }

    int calculateETA(){
        return travelMode.calculateETA();
    }
    void getDirections(){
        travelMode.getDirections();
    }
}
