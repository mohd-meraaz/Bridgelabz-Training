package com.objectmodeling.company;


public class Employee {
    private String employeeName;
    private String empId;

    Employee(String empName, String empId) {
        this.employeeName = empName;
        this.empId =empId;
    }

    //Displaying employee details
    void displayEmployee() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Id: " + empId);
        
    }
}