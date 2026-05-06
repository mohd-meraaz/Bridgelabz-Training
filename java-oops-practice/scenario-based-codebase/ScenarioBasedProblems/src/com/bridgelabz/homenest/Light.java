package com.bridgelabz.homenest;

public class Light extends Device {

    public Light(String deviceId) {
        super(deviceId);
    }

    public void turnOn() {
        setStatus(true);
        energyUsage += 0.5;
    }

    public void turnOff() {
        setStatus(false);
    }

    public void reset() {
        energyUsage = 0;
        firmwareLog = "Light firmware reset";
    }
}
