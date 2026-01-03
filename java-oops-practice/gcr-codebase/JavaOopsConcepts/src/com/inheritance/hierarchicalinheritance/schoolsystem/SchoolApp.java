package com.inheritance.hierarchicalinheritance.schoolsystem;

import java.util.Scanner;

public class SchoolApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Person person = null;

        while (true) {
            System.out.println("\n===== School Management System =====");
            System.out.println("1. Create Teacher");
            System.out.println("2. Create Student");
            System.out.println("3. Create Staff");
            System.out.println("4. Display Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    Teacher teacher = new Teacher();

                    System.out.print("Enter Teacher Name: ");
                    String tName = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int tAge = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Subject: ");
                    String subject = sc.nextLine();

                    teacher.setDetails(tName, tAge);
                    teacher.setSubject(subject);

                    person = teacher;
                    System.out.println("Teacher created successfully!");
                    break;

                case 2:
                    Student student = new Student();

                    System.out.print("Enter Student Name: ");
                    String sName = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int sAge = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Grade: ");
                    String grade = sc.nextLine();

                    student.setDetails(sName, sAge);
                    student.setGrade(grade);

                    person = student;
                    System.out.println("Student created successfully!");
                    break;

                case 3:
                    Staff staff = new Staff();

                    System.out.print("Enter Staff Name: ");
                    String stName = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int stAge = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Department: ");
                    String department = sc.nextLine();

                    staff.setDetails(stName, stAge);
                    staff.setDepartment(department);

                    person = staff;
                    System.out.println("Staff created successfully!");
                    break;

                case 4:
                    if (person != null) {
                        person.displayRole(); 
                        person.showDetails();
                    } else {
                        System.out.println("No person created yet.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting School Management System...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
