package com.inheritance.hybridinheritance.vehiclemanagement;


public class PetrolVehicle extends Vehicle implements Refuelable {

    
    @Override
    public void refuel() {
        System.out.println("Petrol vehicle is being refueled...");
    }
}