package com.generics.coursemanagement;

public class ExamCourse extends CourseType {

	public ExamCourse(String courseName) {
		super(courseName);
	}

	@Override
	void evaluate() {
		System.out.println("\n"+courseName+" evaluate by written exam..");
	}
}