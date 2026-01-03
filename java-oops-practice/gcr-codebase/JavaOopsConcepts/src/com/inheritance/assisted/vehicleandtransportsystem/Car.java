package com.inheritance.assisted.vehicleandtransportsystem;


// Subclass of Vehicle
public class Car extends Vehicle {

    int seatCapacity;
    

    // Overriding method 
    @Override
    public void displayInfo() {
        super.displayInfo(); // calls Vehicle method
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}