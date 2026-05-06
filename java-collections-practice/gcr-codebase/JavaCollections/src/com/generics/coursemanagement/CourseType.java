package com.generics.coursemanagement;

public abstract class CourseType {
	protected String courseName;
	
	public CourseType(String courseName) {
		this.courseName = courseName;
	}
	
	abstract void evaluate();
}