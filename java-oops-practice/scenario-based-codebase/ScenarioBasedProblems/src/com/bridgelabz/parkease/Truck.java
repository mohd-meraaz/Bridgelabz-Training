package com.bridgelabz.parkease;

public class Truck extends Vehicle {

    public Truck(String vehicleNumber) {
        super(vehicleNumber, 100);
    }

    @Override
    public double calculateCharges(int hours) {
        double penalty = hours > 4 ? 200 : 0;
        return (baseRate * hours) + penalty;
    }
}
