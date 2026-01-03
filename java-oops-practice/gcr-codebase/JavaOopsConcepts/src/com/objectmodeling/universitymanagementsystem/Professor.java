package com.objectmodeling.universitymanagementsystem;
import java.util.ArrayList;
public class Professor {
	private String name;
    private ArrayList<Course> courses;

    Professor(String name) {
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
        System.out.println(name + " teaches:");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }

}
