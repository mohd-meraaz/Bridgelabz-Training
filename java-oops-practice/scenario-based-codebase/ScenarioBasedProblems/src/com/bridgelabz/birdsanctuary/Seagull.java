package com.bridgelabz.birdsanctuary;

public class Seagull extends Bird implements IFlyable, ISwimmable {

    public Seagull(String name) {
        super(name, "Seagull");
    }

    @Override
    public void fly() {
        System.out.println("Seagull flies near the sea.");
    }

    @Override
    public void swim() {
        System.out.println("Seagull floats on water.");
    }

    @Override
    public void eat() {
        System.out.println("Seagull eats fish and leftovers.");
    }
}
