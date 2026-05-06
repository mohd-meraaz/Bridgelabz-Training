package com.bridgelabz.constructor.accessspecifier;

class Manager extends Employee {

    Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + getSalary());
    }

   
}
