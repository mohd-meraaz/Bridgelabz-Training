package com.encapsulation.vehiclerentalsystem;

/*
 * Truck rental implementation.
 */
public class Truck extends Vehicle implements Insurable {

    @Override
    public double calculateRentalCost(int days) {
        return (getRentalRate() * days) + 1000; // loading charge
    }

    @Override
    public double calculateInsurance() {
        return 1500;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance: ₹1500 (Heavy Vehicle)";
    }
}
