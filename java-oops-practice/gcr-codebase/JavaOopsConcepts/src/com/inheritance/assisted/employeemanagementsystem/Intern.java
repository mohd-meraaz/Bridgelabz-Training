package com.inheritance.assisted.employeemanagementsystem;
public class Intern extends Employee {

    int durationMonths;

    Intern(String name, int id, double salary, int durationMonths) {
    	// calling parent class constructor
        super(name, id, salary);
        this.durationMonths = durationMonths;
    }

    @Override
    // overriding the method with some extra details
    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + durationMonths + " months");
    }
}