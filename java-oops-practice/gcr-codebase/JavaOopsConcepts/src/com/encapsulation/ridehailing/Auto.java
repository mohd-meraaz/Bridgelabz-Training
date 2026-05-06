package com.encapsulation.ridehailing;

/*
 * Auto-rickshaw ride implementation.
 */
public class Auto extends Vehicle implements GPS {

    private String location = "Unknown";

    @Override
    public double calculateFare(double distance) {
        return (distance * getRatePerKm()) + 20; // base charge
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
