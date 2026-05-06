package com.encapsulation.vehiclerentalsystem;

/*
 * Abstract base class for all vehicles.
 * Demonstrates encapsulation and abstraction.
 */
public abstract class Vehicle {

    private String vehicleNumber;
    private String type;
    private double rentalRate;

    // Sensitive data (encapsulated)
    private String insurancePolicyNumber;

    // Set vehicle details
    public void setVehicleDetails(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Insurance policy setter (no getter for security)
    public void setInsurancePolicyNumber(String policyNumber) {
        this.insurancePolicyNumber = policyNumber;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public String getType() {
        return type;
    }

    // Abstract method
    public abstract double calculateRentalCost(int days);

    public void displayVehicleDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate per Day: " + rentalRate);
    }
}
