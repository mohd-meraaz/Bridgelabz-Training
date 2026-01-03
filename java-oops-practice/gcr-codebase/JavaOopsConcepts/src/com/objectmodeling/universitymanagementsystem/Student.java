package com.objectmodeling.universitymanagementsystem;
import java.util.ArrayList;


public class Student {
	private String name;
    private ArrayList<Course> courses;

    Student(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }

    String getName() {
        return name;
    }

    void addCourse(Course course) {
        courses.add(course);
    }

    void viewCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }

}
