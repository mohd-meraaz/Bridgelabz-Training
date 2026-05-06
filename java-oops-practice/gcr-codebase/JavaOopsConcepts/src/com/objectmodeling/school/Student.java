package com.objectmodeling.school;

import java.util.ArrayList;

public class Student {
	String studentName;
	ArrayList<Course> enrolledCourses = new ArrayList<>();
	
	Student(String name) {
        this.studentName = name;
        enrolledCourses = new ArrayList<>();
    }

    String getName() {
        return studentName;
    }

    // Association: enroll in a course
    void enrollInCourse(Course course) {
    	enrolledCourses.add(course);
        course.enrollStudent(this); // many-to-many association
    }

    void viewCourses() {
        System.out.println(studentName + " is enrolled in:");
        for (Course c : enrolledCourses) {
            System.out.println( c.getCourseName());
        }
    }
    
    

}
