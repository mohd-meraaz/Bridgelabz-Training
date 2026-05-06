package com.bridgelabz.birdsanctuary;

public class Eagle extends Bird implements IFlyable {

    public Eagle(String name) {
        super(name, "Eagle");
    }

    @Override
    public void fly() {
        System.out.println("Eagle soars high in the sky.");
    }

    @Override
    public void eat() {
        System.out.println("Eagle eats meat.");
    }
}
