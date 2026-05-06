package com.objectmodeling.school;

import java.util.ArrayList;

public class School {
    String schoolName;
    ArrayList<Student> students;

    // Constructor
    School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    // Aggregation: add student to school
    void addStudent(Student student) {
        students.add(student);
    }

    void displayStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student s : students) {
            System.out.println( s.getName());
        }
    }

    public static void main(String[] args) {

        // Create school
        School school = new School("Green Valley School");

        // Create students
        Student s1 = new Student("Titu");
        Student s2 = new Student("Anni");

        // Add students to school 
        school.addStudent(s1);
        school.addStudent(s2);

        // Create courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        // Enroll students in courses 
        s1.enrollInCourse(math);
        s1.enrollInCourse(science);

        s2.enrollInCourse(math);

        // Display data
        school.displayStudents();
        System.out.println();

        s1.viewCourses();
        System.out.println();

        s2.viewCourses();
        System.out.println();

        math.displayStudents();
        System.out.println();

        science.displayStudents();
    }
}
