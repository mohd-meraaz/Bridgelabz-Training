package com.functionalinterface.homeautomation;

public class TV {
    public String Type;
    public TurnOn turnOn;
    public TurnOff turnOff;
    
    public TV() {
    	turnOn = ()->System.out.println("Turning on TV");
    	turnOff = ()-> System.out.println("Turning off TV");
    }
}