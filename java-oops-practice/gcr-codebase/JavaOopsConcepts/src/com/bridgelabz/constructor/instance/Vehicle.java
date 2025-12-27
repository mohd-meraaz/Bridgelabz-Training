package com.bridgelabz.constructor.instance;

class Vehicle {

    // Instance variables
    String ownerName;
    String vehicleType;

    // Class (static) variable
    static double registrationFee = 5000;

    // Constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
        System.out.println("--------------------------");
    }

    // Class (static) method
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Main method inside the class
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Rahul", "Car");
        Vehicle v2 = new Vehicle("Anita", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Update registration fee for all vehicles
        Vehicle.updateRegistrationFee(6500);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
