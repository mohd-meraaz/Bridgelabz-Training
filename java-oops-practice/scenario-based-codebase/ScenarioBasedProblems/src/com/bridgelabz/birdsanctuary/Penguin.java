package com.bridgelabz.birdsanctuary;

public class Penguin extends Bird implements ISwimmable {

    public Penguin(String name) {
        super(name, "Penguin");
    }

    @Override
    public void swim() {
        System.out.println("Penguin swims in icy water.");
    }

    @Override
    public void eat() {
        System.out.println("Penguin eats fish.");
    }
}
