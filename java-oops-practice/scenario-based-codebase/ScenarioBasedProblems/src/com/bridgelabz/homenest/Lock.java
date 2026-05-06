package com.bridgelabz.homenest;

public class Lock extends Device {

    public Lock(String deviceId) {
        super(deviceId);
    }

    public void turnOn() {
        setStatus(true); // locked
    }

    public void turnOff() {
        setStatus(false); // unlocked
    }

    public void reset() {
        firmwareLog = "Lock security reset";
    }
}
