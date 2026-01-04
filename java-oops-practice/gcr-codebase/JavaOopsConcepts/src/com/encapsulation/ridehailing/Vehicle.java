package com.encapsulation.ridehailing;

/*
 * Abstract base class for all ride-hailing vehicles.
 * Demonstrates encapsulation and abstraction.
 */
public abstract class Vehicle {

    private int vehicleId;
    private String driverName;
    private double ratePerKm;

    // Encapsulation using setter
    public void setVehicleDetails(int vehicleId, String driverName, double ratePerKm) {
        if (vehicleId <= 0 || ratePerKm <= 0) {
            System.out.println("Invalid vehicle details!");
            return;
        }
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    protected double getRatePerKm() {
        return ratePerKm;
    }

    // Abstract method
    public abstract double calculateFare(double distance);

    // Concrete method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
    }
}
