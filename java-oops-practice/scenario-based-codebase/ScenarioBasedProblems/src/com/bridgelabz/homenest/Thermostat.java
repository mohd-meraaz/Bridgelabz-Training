package com.bridgelabz.homenest;

public class Thermostat extends Device {

    public Thermostat(String deviceId) {
        super(deviceId);
    }

    public void turnOn() {
        setStatus(true);
        energyUsage += 2.5;
    }

    public void turnOff() {
        setStatus(false);
    }

    public void reset() {
        energyUsage = 0;
        firmwareLog = "Thermostat calibration reset";
    }
}
