package com.generics.coursemanagement;

public class AssignmentCourse extends CourseType{

	public AssignmentCourse(String courseName) {
		super(courseName);
	}

	@Override
	void evaluate() {
		System.out.println("\n"+courseName+" evaluate by assignment exam..");
	}
}