package com.traincompanion;

class Compartment {
    String name;
    boolean hasPantry;
    boolean hasWiFi;

    Compartment prev;
    Compartment next;

    public Compartment(String name, boolean hasPantry, boolean hasWiFi) {
        this.name = name;
        this.hasPantry = hasPantry;
        this.hasWiFi = hasWiFi;
    }
}
