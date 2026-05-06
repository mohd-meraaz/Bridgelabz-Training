package com.bridgelabz.homenest;

public abstract class Device implements IControllable {
    protected String deviceId;
    private boolean status;              // Encapsulation
    protected double energyUsage;         // kWh
    protected String firmwareLog;         // secured log

    // Constructor registers device
    public Device(String deviceId) {
        this.deviceId = deviceId;
        this.status = false;
        this.energyUsage = 0;
        this.firmwareLog = "Firmware v1.0";
    }

    // Controlled access
    public boolean isOn() {
        return status;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    // Operator usage
    public double calculateEnergyCost(double ratePerUnit) {
        return energyUsage * ratePerUnit;
    }

    // Abstract method (polymorphism)
    public abstract void reset();
}
