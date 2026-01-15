package com.bridgelabz.birdsanctuary;

public class Ostrich extends Bird {

    public Ostrich(String name) {
        super(name, "Ostrich");
    }

    @Override
    public void eat() {
        System.out.println("Ostrich eats plants.");
    }
}
