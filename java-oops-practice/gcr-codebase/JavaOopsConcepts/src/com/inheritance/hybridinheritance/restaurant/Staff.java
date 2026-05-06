package com.inheritance.hybridinheritance.restaurant;

public class Staff extends Person {

    // Inherit setDetails() from Person
    // No need to redefine it

    public void showDetails() {
        System.out.println("Staff Name: " + name);
        System.out.println("Staff ID: " + id);
    }
}
