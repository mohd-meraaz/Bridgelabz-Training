package com.bridgelabz.hospitalmanagementsystem;

public class OutPatient extends Patient {

    public OutPatient(String id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public void displayInfo() {
        System.out.println(
            getSummary() + "\nType: OutPatient"
            
        );
        System.out.println();
    }
}
