package com.inheritance.singleinheritance.smarthome;

/*
 * Thermostat is a subclass of Device.
 * This demonstrates SINGLE INHERITANCE.
 */
public class Thermostat extends Device {

    // Temperature setting for the thermostat
    private int temperatureSetting;

    /*
     * Sets temperature for the thermostat.
     */
    public void setTemperature(int temperatureSetting) {
        this.temperatureSetting = temperatureSetting;
    }

    /*
     * Displays the complete status of the thermostat.
     * Uses inherited and subclass-specific data.
     */
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}
