package com.bridgelabz.parkease;

public class ParkingSlot {

    private int slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;
    private String location;

    private String bookingLog; // internal record

    public ParkingSlot(int slotId, String location, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.location = location;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    public boolean isAvailable() {
        return !isOccupied;
    }

    // Internal state modification only via methods
    public void assignSlot(String vehicleNumber) {
        if (!isOccupied) {
            isOccupied = true;
            bookingLog = "Slot " + slotId + " booked by " + vehicleNumber;
        }
    }

    public void releaseSlot() {
        isOccupied = false;
        bookingLog = "Slot " + slotId + " is now available";
    }

    public String getBookingLog() {
        return bookingLog;
    }
}
