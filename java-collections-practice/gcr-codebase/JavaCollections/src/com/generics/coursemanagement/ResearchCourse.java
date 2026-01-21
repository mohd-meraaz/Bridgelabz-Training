package com.generics.coursemanagement;

public class ResearchCourse extends CourseType {

	public ResearchCourse(String courseName) {
		super(courseName);
	}

	@Override
	void evaluate() {
		System.out.println("\n"+courseName+" evaluate by research exam..");
	}
}