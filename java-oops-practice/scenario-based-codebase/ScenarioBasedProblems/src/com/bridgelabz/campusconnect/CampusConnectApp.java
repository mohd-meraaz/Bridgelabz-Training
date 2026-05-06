package com.bridgelabz.campusconnect;

import java.util.ArrayList;
import java.util.Scanner;

public class CampusConnectApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();
        ArrayList<Faculty> faculties = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n=== CampusConnect Menu ===");
            System.out.println("1. Add Faculty");
            System.out.println("2. Add Course");
            System.out.println("3. Add Student");
            System.out.println("4. Enroll Student in Course");
            System.out.println("5. Drop Student from Course");
            System.out.println("6. Add Grade to Student");
            System.out.println("7. View Student Details");
            System.out.println("8. View Course Details");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                // ---------- ADD FACULTY ----------
                case 1:
                    System.out.print("Faculty Name: ");
                    String fName = sc.nextLine();

                    System.out.print("Faculty Email: ");
                    String fEmail = sc.nextLine();

                    System.out.print("Faculty ID: ");
                    String fId = sc.nextLine();

                    System.out.print("Department: ");
                    String dept = sc.nextLine();

                    System.out.print("Designation: ");
                    String desig = sc.nextLine();

                    faculties.add(new Faculty(fName, fEmail, fId, dept, desig));
                    System.out.println("Faculty added successfully.");
                    break;

                // ---------- ADD COURSE ----------
                case 2:
                    if (faculties.isEmpty()) {
                        System.out.println("Add faculty first.");
                        break;
                    }

                    System.out.print("Course ID: ");
                    int courseId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Course Name: ");
                    String courseName = sc.nextLine();

                    System.out.println("Select Faculty:");
                    for (int i = 0; i < faculties.size(); i++) {
                        System.out.println(i + ". " + faculties.get(i).getClass().getSimpleName());
                        faculties.get(i).printDetails();
                    }

                    int fIndex = sc.nextInt();
                    sc.nextLine();

                    courses.add(new Course(courseId, courseName, faculties.get(fIndex)));
                    System.out.println("Course added successfully.");
                    break;

                // ---------- ADD STUDENT ----------
                case 3:
                    System.out.print("Student Name: ");
                    String sName = sc.nextLine();

                    System.out.print("Student Email: ");
                    String sEmail = sc.nextLine();

                    System.out.print("Student ID: ");
                    String sId = sc.nextLine();

                    students.add(new Student(sName, sEmail, sId));
                    System.out.println("Student added successfully.");
                    break;

                // ---------- ENROLL ----------
                case 4:
                    if (students.isEmpty() || courses.isEmpty()) {
                        System.out.println("Add students and courses first.");
                        break;
                    }

                    System.out.println("Select Student:");
                    for (int i = 0; i < students.size(); i++) {
                        System.out.println(i + ". " + students.get(i));
                    }

                    int sEnroll = sc.nextInt();

                    System.out.println("Select Course:");
                    for (int i = 0; i < courses.size(); i++) {
                        System.out.println(i + ". " + courses.get(i));
                    }

                    int cEnroll = sc.nextInt();
                    sc.nextLine();

                    courses.get(cEnroll).enrollCourse(students.get(sEnroll));
                    break;

                // ---------- DROP ----------
                case 5:
                    System.out.println("Select Student:");
                    for (int i = 0; i < students.size(); i++) {
                        System.out.println(i + ". " + students.get(i));
                    }

                    int sDrop = sc.nextInt();

                    System.out.println("Select Course:");
                    for (int i = 0; i < courses.size(); i++) {
                        System.out.println(i + ". " + courses.get(i));
                    }

                    int cDrop = sc.nextInt();
                    sc.nextLine();

                    courses.get(cDrop).dropCourse(students.get(sDrop));
                    break;

                // ---------- ADD GRADE ----------
                case 6:
                    System.out.println("Select Student:");
                    for (int i = 0; i < students.size(); i++) {
                        System.out.println(i + ". " + students.get(i));
                    }

                    int sGrade = sc.nextInt();
                    System.out.print("Enter grade: ");
                    float grade = sc.nextFloat();
                    sc.nextLine();

                    students.get(sGrade).addGrades(grade);
                    System.out.println("Grade added.");
                    break;

                // ---------- VIEW STUDENT ----------
                case 7:
                    for (Student s : students) {
                        s.printDetails();
                        System.out.println("------------------");
                    }
                    break;

                // ---------- VIEW COURSE ----------
                case 8:
                    for (Course c : courses) {
                        c.printCourseDetails();
                        System.out.println("------------------");
                    }
                    break;

                case 0:
                    System.out.println("Exiting CampusConnect...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        sc.close();
    }
}
