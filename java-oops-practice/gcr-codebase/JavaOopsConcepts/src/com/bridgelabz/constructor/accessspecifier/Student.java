package com.bridgelabz.constructor.accessspecifier;


class Student {

    // Access modifiers
    public int rollNumber;
    protected String name;
    private double cgpa;

    // Constructor
    Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Public methods to access private CGPA
    public double getCGPA() {
        return cgpa;
    }

    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }
}

// Subclass

