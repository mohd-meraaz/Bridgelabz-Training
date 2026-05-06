package com.bridgelabz.parkease;

public class ParkEaseApp {
    public static void main(String[] args) {

        ParkingSlot slot = new ParkingSlot(101, "City Center", "Car");
        Vehicle vehicle = new Car("MH12AB1234");

        if (slot.isAvailable()) {
            slot.assignSlot(vehicle.vehicleNumber);
            System.out.println("Parking Assigned");
        }

        int duration = 6; // hours
        double charges = vehicle.calculateCharges(duration);

        System.out.println("Parking Charges: ₹" + charges);
        System.out.println("Log: " + slot.getBookingLog());

        slot.releaseSlot();
    }
}
