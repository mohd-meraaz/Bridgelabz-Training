package com.encapsulation.vehiclerentalsystem;

/*
 * Bike rental implementation.
 */
public class Bike extends Vehicle implements Insurable {

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 200; // fixed insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance: ₹200 (Fixed)";
    }
}
