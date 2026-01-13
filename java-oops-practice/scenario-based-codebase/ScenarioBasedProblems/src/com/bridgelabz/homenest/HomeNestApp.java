package com.bridgelabz.homenest;

public class HomeNestApp {
    public static void main(String[] args) {

        Device[] devices = {
            new Light("L101"),
            new Camera("C201"),
            new Thermostat("T301"),
            new Lock("K401")
        };

        for (Device d : devices) {
            d.turnOn();
            d.reset();   // polymorphic behavior
            System.out.println(
                d.deviceId + " energy cost: ₹" +
                d.calculateEnergyCost(10)
            );
        }
    }
}
