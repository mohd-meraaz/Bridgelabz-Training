package com.functionalinterface.homeautomation;


public class AC {
    public String type;
    public TurnOn turnOn;
    public TurnOff turnOff;
    
    public AC() {
    	turnOn = () -> System.out.println("Turning on AC");
    	turnOff = ()-> System.out.println("Turning off AC");
    }
}