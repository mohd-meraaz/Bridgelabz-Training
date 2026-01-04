package com.encapsulation.ridehailing;

/*
 * Car ride implementation.
 */
public class Car extends Vehicle implements GPS {

    private String location = "Unknown";

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
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
