package com.stateDesignPattern.exercise;

public class Main {
    public static void main(String[] args) {
        // build a class to calculate the eta of an user using our application
        // the function called calcETA and it checks if you in a car or bus or walking
        // using the car return 1 as eta
        // using the bus return 10 as eta
        // walking return 50 as eta
        //implement another function called get directions using your travelMode
        // print a valid message for the user using the mode

        var driving = new Driving();
        var map = new OurMap();
        map.setTravelMode(driving);
        map.getDirections();
    }
}
