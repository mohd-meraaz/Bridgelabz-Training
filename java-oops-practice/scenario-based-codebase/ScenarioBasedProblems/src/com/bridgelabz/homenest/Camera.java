package com.bridgelabz.homenest;

public class Camera extends Device {

    public Camera(String deviceId) {
        super(deviceId);
    }

    public void turnOn() {
        setStatus(true);
        energyUsage += 1.2;
    }

    public void turnOff() {
        setStatus(false);
    }

    public void reset() {
        firmwareLog = "Camera rebooted & cache cleared";
    }
}
