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
class PostgraduateStudent extends Student {

    PostgraduateStudent(int rollNumber, String name, double cgpa) {
        super(rollNumber, name, cgpa);
    }

    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber); // public
        System.out.println("Name: " + name);               // protected
        System.out.println("CGPA: " + getCGPA());           // private via method
    }

    
}

class Main{
	public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Rahul", 8.5);
        pg.displayDetails();
    }
	
}