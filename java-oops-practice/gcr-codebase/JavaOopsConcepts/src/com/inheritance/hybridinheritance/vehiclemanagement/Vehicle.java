package com.inheritance.hybridinheritance.vehiclemanagement;


//Vehicle class (Superclass)

 
public class Vehicle {

    protected String model;
    protected int maxSpeed;

    // constructor
    public void setVehicleDetails(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // Display 
    public void displayVehicleDetails() {
        System.out.println("Vehicle Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}