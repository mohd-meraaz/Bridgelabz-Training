package com.generics.coursemanagement;

public class CourseMangementApp {
	public static void main(String[] args) {
	Course<ExamCourse> csDept = new Course<>();
	csDept.addCourse(new ExamCourse("Data Structure"));
	csDept.addCourse(new ExamCourse("Operating System"));
	
	Course<AssignmentCourse> designDept = new Course<>();
	designDept.addCourse(new AssignmentCourse("UI/UX"));
	designDept.addCourse(new AssignmentCourse("Frontend Developement"));
	
	
	Course<ResearchCourse> phd = new Course<>();
	phd.addCourse(new ResearchCourse("AI Research"));
	phd.addCourse(new ResearchCourse("Human Mind Research"));
	
	
	//evaluate
	csDept.evaluateCourse();
	
	designDept.evaluateCourse();
	
	phd.evaluateCourse();
}

}