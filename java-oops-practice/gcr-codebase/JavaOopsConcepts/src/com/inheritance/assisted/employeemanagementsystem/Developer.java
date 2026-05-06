package com.inheritance.assisted.employeemanagementsystem;
public class Developer extends Employee {

    String programmingLanguage;

    // constructor
    Developer(String name, int id, double salary, String programmingLanguage) {
    	// calling parent class constructor
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // overriding the method with some extra details
    @Override
    void displayDetails() {
    	// calling parent class method
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}