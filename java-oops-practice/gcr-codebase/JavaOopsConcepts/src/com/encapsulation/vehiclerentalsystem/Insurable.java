package com.encapsulation.vehiclerentalsystem;

/*
 * Interface for vehicles that support insurance.
 */
public interface Insurable {

    double calculateInsurance();

    String getInsuranceDetails();
}
