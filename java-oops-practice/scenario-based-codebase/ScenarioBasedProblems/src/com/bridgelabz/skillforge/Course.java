package com.bridgelabz.skillforge;

import java.util.Arrays;

public class Course implements ICertifiable {

    private String title;
    private Instructor instructor;
    private double rating;
    private String[] modules;

    private String[] reviews;   // read-only internally

    // Constructor with default modules
    public Course(String title, Instructor instructor) {
        this(title, instructor, new String[]{"Introduction", "Basics", "Final Project"});
    }

    // Constructor with custom modules
    public Course(String title, Instructor instructor, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.rating = 4.0;
        this.reviews = new String[]{"Great course!"};
    }

    // Protected rating logic
    protected void updateRating(double newRating) {
        rating = (rating + newRating) / 2; // operator usage
    }

    public double getRating() {
        return rating;
    }

    public String[] getReviews() {
        return Arrays.copyOf(reviews, reviews.length); // read-only exposure
    }

    @Override
    public void generateCertificate(Student student) {
        if (student.getProgress() == 100 && student.getScore() >= 60) {
            System.out.println("Certificate Generated for " + student.name);
            System.out.println("Course: " + title);
            System.out.println("Instructor: " + instructor.name);
        } else {
            System.out.println("Student not eligible for certification");
        }
    }
}
