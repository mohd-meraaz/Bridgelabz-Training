package com.encapsulation.ridehailing;

/*
 * Bike ride implementation.
 */
public class Bike extends Vehicle implements GPS {

    private String location = "Unknown";

    @Override
    public double calculateFare(double distance) {
        return (distance * getRatePerKm()) * 0.9; // cheaper ride
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String location) {
        this.location = location;
    }
}
