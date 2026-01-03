package com.inheritance.assisted.employeemanagementsystem;

import java.util.Scanner;

public class EmployeeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee employee = null;

        while (true) {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Create Manager");
            System.out.println("2. Create Developer");
            System.out.println("3. Create Intern");
            System.out.println("4. Display Employee Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("Enter Manager Name: ");
                    String mName = sc.nextLine();

                    System.out.print("Enter ID: ");
                    int mId = sc.nextInt();

                    System.out.print("Enter Salary: ");
                    double mSalary = sc.nextDouble();

                    System.out.print("Enter Team Size: ");
                    int teamSize = sc.nextInt();

                    employee = new Manager(mName, mId, mSalary, teamSize);
                    System.out.println("Manager created successfully!");
                    break;

                case 2:
                    System.out.print("Enter Developer Name: ");
                    String dName = sc.nextLine();

                    System.out.print("Enter ID: ");
                    int dId = sc.nextInt();

                    System.out.print("Enter Salary: ");
                    double dSalary = sc.nextDouble();
                    sc.nextLine(); // consume newline

                    System.out.print("Enter Programming Language: ");
                    String language = sc.nextLine();

                    employee = new Developer(dName, dId, dSalary, language);
                    System.out.println("Developer created successfully!");
                    break;

                case 3:
                    System.out.print("Enter Intern Name: ");
                    String iName = sc.nextLine();

                    System.out.print("Enter ID: ");
                    int iId = sc.nextInt();

                    System.out.print("Enter Salary: ");
                    double iSalary = sc.nextDouble();

                    System.out.print("Enter Internship Duration (months): ");
                    int duration = sc.nextInt();

                    employee = new Intern(iName, iId, iSalary, duration);
                    System.out.println("Intern created successfully!");
                    break;

                case 4:
                    if (employee != null) {
                        employee.displayDetails(); 
                    } else {
                        System.out.println("No employee created yet.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting application...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
