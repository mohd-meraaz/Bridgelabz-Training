package com.bridgelabz.universitycourseenrollmentsystem;


import java.util.Scanner;

// Main class
public class UniversityApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Student input
        System.out.print("Enter Student ID: ");
        int studentId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        System.out.println("Select Student Type");
        System.out.println("1. Undergraduate");
        System.out.println("2. Postgraduate");
        int type = sc.nextInt();

        Student student;

        // Polymorphism
        if (type == 1) {
            student = new Undergraduate(studentId, studentName);
        } else {
            student = new Postgraduate(studentId, studentName);
        }

        // Course input
        sc.nextLine();
        System.out.print("Enter Course Code: ");
        String code = sc.nextLine();

        System.out.print("Enter Course Name: ");
        String cname = sc.nextLine();

        Course course = new Course(code, cname);

        // Faculty input
        System.out.print("Enter Faculty Name: ");
        String fname = sc.nextLine();

        Faculty faculty = new Faculty(fname);

        // Marks input
        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        // Assign grade
        faculty.gradeStudent(student, marks);

        // Enrollment details
        Enrollment enrollment = new Enrollment(student, course);

        System.out.println("\n===== ENROLLMENT DETAILS =====");
        faculty.showFaculty();
        enrollment.showEnrollment();

        sc.close();
    }
}