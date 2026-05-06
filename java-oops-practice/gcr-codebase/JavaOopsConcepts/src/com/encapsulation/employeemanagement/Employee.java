package com.encapsulation.employeemanagement;

/*
 * Abstract base class for all employees.
 * Demonstrates encapsulation and abstraction.
 */
public abstract class Employee {

    private int employeeId;
    private String name;
    private double baseSalary;

    protected String department;

    // Encapsulation using setters with validation
    public void setEmployeeDetails(int employeeId, String name, double baseSalary) {
        if (employeeId <= 0 || baseSalary < 0) {
            System.out.println("Invalid employee details!");
            return;
        }
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Concrete method
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Final Salary: " + calculateSalary());
    }
}
