package com.bridgelabz.constructor.instance;

class Course {

    // Instance variables
    String courseName;
    int duration; // in months
    double fee;

    // Class variable
    static String instituteName = "BridgeLabz";

    // Constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    void displayCourseDetails() {
        System.out.println("Institute: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: ₹" + fee);
        System.out.println("---------------------------");
    }

    // Class method
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    // Main method inside class
    public static void main(String[] args) {

        Course c1 = new Course("Java Full Stack", 6, 45000);
        Course c2 = new Course("Python Development", 4, 30000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("BridgeLabz Training");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
