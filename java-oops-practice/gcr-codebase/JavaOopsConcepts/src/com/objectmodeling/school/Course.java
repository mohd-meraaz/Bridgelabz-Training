package com.objectmodeling.school;

import java.util.ArrayList;

public class Course {
	String courseName;
	ArrayList<Student> enrolledStudents = new ArrayList<>();
	
	Course(String courseName){
		 this.courseName = courseName;
		 enrolledStudents = new ArrayList<>();
	}
	// Association: add student to course
    void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }
    

    void displayStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student s : enrolledStudents) {
            System.out.println( s.getName());
        }
    }

    String getCourseName() {
        return courseName;
    }
}
