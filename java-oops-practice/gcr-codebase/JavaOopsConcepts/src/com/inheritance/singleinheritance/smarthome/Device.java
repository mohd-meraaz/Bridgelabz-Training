package com.inheritance.singleinheritance.smarthome;

/*
 * Device is the superclass.
 * It stores common information for all smart devices.
 */
public class Device {

    // Unique ID of the device
    protected String deviceId;

    // Current status of the device (ON / OFF)
    protected String status;

    /*
     * Sets basic device details.
     * This method can be reused by subclasses.
     */
    public void setDeviceDetails(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}
