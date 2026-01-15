package com.bridgelabz.birdsanctuary;


public class Duck extends Bird implements ISwimmable {

    public Duck(String name) {
        super(name, "Duck");
    }

    @Override
    public void swim() {
        System.out.println("Duck swims in the pond.");
    }

    @Override
    public void eat() {
        System.out.println("Duck eats grains.");
    }
}
