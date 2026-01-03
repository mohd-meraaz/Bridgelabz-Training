package com.objectmodeling.universitymanagementsystem;
import java.util.ArrayList;
public class Course {
	private String courseName;
    private Professor professor; 
    private ArrayList<Student> students; 

    Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<>();
    }

    void assignProfessor(Professor professor) {
        this.professor = professor;
        professor.addCourse(this);
        System.out.println(professor.getName() + " assigned to " + courseName);
    }

    void enrollStudent(Student student) {
        students.add(student);
        student.addCourse(this);
        System.out.println(student.getName() + " enrolled in " + courseName);
    }

    void displayCourse() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Professor: " + professor.getName());
        }
        System.out.println("Enrolled Students:");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }

    String getCourseName() {
        return courseName;
    }

}
