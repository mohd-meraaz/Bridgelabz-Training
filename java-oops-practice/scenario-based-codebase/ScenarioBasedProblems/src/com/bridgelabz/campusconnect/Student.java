package com.bridgelabz.campusconnect;
import java.util.*;
public class Student extends Person{
	
	// List to store enrolled courses and grades of a student
	protected ArrayList<Course> enrolledCourses = new ArrayList<>();
	protected ArrayList<Float> grades = new ArrayList<>();
	
	Student(String name, String email, String id) {
		super(name, email, id);
	}

	// method to calculate gpa
	public float calculateGpa() {
	    if (grades.isEmpty()) {
	        return 0.0f;
	    }

	    float sum = 0.0f;
	    for (float grade : grades) {
	        sum += grade;
	    }

	    return sum / grades.size();
	}

//	Method to add grades
	public void addGrades(float num) {
		grades.add(num);
	}
	
	
	
	@Override
	public  void printDetails() {
		super.printDetails();
		System.out.println("Current SGPA : "+ calculateGpa() );
	}
	
	
	
	
}
