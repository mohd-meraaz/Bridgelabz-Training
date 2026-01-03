package com.inheritance.assisted.employeemanagementsystem;
public class Manager extends Employee {

    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
    	// calling parent class constructor
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    // overriding the method with some extra details
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}