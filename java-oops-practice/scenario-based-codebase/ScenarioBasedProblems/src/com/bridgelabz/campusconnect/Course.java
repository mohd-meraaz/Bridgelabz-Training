package com.bridgelabz.campusconnect;

import java.util.ArrayList;

public class Course implements ICourseActions {

    private int courseId;
    private String courseName;
    private Faculty faculty;                 // One faculty assigned
    private ArrayList<Student> students;     // List of enrolled students

    // Constructor to initialize course and assign faculty
    Course(int courseId, String courseName, Faculty faculty) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.faculty = faculty;
        this.students = new ArrayList<>();
    }

    // Enroll a student in the course
    @Override
    public void enrollCourse(Student student) {
        if (student == null) {
            return;
        }

        if (!students.contains(student)) {
            students.add(student);
            System.out.println("Student enrolled in course: " + courseName);
        } else {
            System.out.println("Student already enrolled in this course.");
        }
    }

    // Drop a student from the course
    @Override
    public void dropCourse(Student student) {
        if (student == null) {
            return;
        }

        if (students.remove(student)) {
            System.out.println("Student dropped from course: " + courseName);
        } else {
            System.out.println("Student not found in this course.");
        }
    }

    // Print course details
    public void printCourseDetails() {
        System.out.println("Course ID   : " + courseId);
        System.out.println("Course Name : " + courseName);
        System.out.println("Faculty     : ");
        faculty.printDetails();
        System.out.println("Total Students Enrolled : " + students.size());
    }
}
