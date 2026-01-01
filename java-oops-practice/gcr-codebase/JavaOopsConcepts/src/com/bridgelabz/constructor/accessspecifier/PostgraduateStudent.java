package com.bridgelabz.constructor.accessspecifier;

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