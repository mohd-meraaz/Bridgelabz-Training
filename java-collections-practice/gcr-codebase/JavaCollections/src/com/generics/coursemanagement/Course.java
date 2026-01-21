package com.generics.coursemanagement;
import java.util.*;

public class Course <T extends CourseType >{
	private List<T> courseList = new ArrayList<>();
	
	//add
	public void addCourse(T course) {
		courseList.add(course);
	}
	
	//evaluate
	public void evaluateCourse() {
		for(T t: courseList) {
			t.evaluate();
		}
	}
	
	//get
	public List<T> getCourseList(){
		return courseList;
	}
}