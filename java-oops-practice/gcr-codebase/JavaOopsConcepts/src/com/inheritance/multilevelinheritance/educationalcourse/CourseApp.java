package com.inheritance.multilevelinheritance.educationalcourse;

import java.util.Scanner;

public class CourseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PaidOnlineCourse course = null;

        while (true) {
            System.out.println("\n===== Educational Course Management System =====");
            System.out.println("1. Create Paid Online Course");
            System.out.println("2. Display Course Details");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    course = new PaidOnlineCourse();

                    System.out.print("Enter Course Name: ");
                    course.courseName = sc.nextLine();

                    System.out.print("Enter Duration (days): ");
                    course.duration = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Platform Name: ");
                    course.platform = sc.nextLine();

                    System.out.print("Is the course recorded? (true/false): ");
                    course.isRecorded = sc.nextBoolean();

                    System.out.print("Enter Course Fee: ");
                    course.fee = sc.nextDouble();

                    System.out.print("Enter Discount Amount: ");
                    course.discount = sc.nextDouble();

                    System.out.println("Paid Online Course created successfully!");
                    break;

                case 2:
                    if (course != null) {
                        System.out.println("\nCourse Details:");
                        System.out.println("Course Name: " + course.courseName);
                        System.out.println("Duration: " + course.duration + " days");
                        System.out.println("Platform: " + course.platform);
                        System.out.println("Recorded: " + course.isRecorded);
                        System.out.println("Fee: " + course.fee);
                        System.out.println("Discount: " + course.discount);
                    } else {
                        System.out.println("No course created yet.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting Course Management System...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
