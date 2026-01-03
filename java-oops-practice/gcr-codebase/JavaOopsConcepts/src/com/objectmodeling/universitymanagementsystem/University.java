package com.objectmodeling.universitymanagementsystem;

public class University {
	
	public static void main(String[] args) {
	    // creating professors object
        Professor prof1 = new Professor("Dr. Priya");
        Professor prof2 = new Professor("Prof. Kaif");

        // creating Courses object
        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Chemistry");

        // Assign professors
        c1.assignProfessor(prof1);
        c2.assignProfessor(prof2);

        // creating students object
        Student s1 = new Student("Rohan");
        Student s2 = new Student("Rahul");

        // Enrolling students
        c1.enrollStudent(s1);
        c1.enrollStudent(s2);
        c2.enrollStudent(s1);

        // Displaying the details
        c1.displayCourse();
        System.out.println();
        c2.displayCourse();
        System.out.println();
        s1.viewCourses();
        System.out.println();
        prof1.viewCourses();
    }
}