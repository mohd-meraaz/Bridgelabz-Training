package com.encapsulation.employeemanagement;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Main application class for Employee Management System.
 */
public class EmployeeApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Full-Time Employee");
            System.out.println("2. Add Part-Time Employee");
            System.out.println("3. Display All Employees");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    FullTimeEmployee fte = new FullTimeEmployee();

                    System.out.print("Enter ID: ");
                    int fId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String fName = sc.nextLine();

                    System.out.print("Enter Base Salary: ");
                    double fSalary = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter Department: ");
                    String fDept = sc.nextLine();

                    fte.setEmployeeDetails(fId, fName, fSalary);
                    fte.assignDepartment(fDept);

                    employees.add(fte);
                    System.out.println("Full-Time Employee added successfully!");
                    break;

                case 2:
                    PartTimeEmployee pte = new PartTimeEmployee();

                    System.out.print("Enter ID: ");
                    int pId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String pName = sc.nextLine();

                    System.out.print("Enter Base Salary (0 if none): ");
                    double base = sc.nextDouble();

                    System.out.print("Enter Working Hours: ");
                    int hours = sc.nextInt();

                    System.out.print("Enter Hourly Rate: ");
                    double rate = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter Department: ");
                    String pDept = sc.nextLine();

                    pte.setEmployeeDetails(pId, pName, base);
                    pte.setWorkDetails(hours, rate);
                    pte.assignDepartment(pDept);

                    employees.add(pte);
                    System.out.println("Part-Time Employee added successfully!");
                    break;

                case 3:
                    if (employees.isEmpty()) {
                        System.out.println("No employees found.");
                    } else {
                        for (Employee e : employees) {
                            System.out.println("\n------------------");
                            e.displayDetails(); // polymorphism
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting Employee Management System...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
