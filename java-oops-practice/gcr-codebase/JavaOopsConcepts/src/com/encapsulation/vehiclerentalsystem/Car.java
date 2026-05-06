package com.encapsulation.vehiclerentalsystem;

/*
 * Car rental implementation.
 */
public class Car extends Vehicle implements Insurable {

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 500; // fixed insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance: ₹500 (Fixed)";
    }
}
