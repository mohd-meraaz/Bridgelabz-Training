package com.functionalinterface.homeautomation;

public class Lights {
    public String type;
    public TurnOn turnOn;
    public TurnOff turnOff;
    
    public  Lights() {
    	turnOn = ()-> System.out.println("Turnning on Lights");
    	turnOff = ()->System.out.println("Turning Off Lights");
    }
}