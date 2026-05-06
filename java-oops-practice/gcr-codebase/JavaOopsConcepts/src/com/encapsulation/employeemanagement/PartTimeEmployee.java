package com.encapsulation.employeemanagement;

/*
 * Represents a part-time employee.
 */
public class PartTimeEmployee extends Employee implements Department {

    private int workingHours;
    private double hourlyRate;

    public void setWorkDetails(int workingHours, double hourlyRate) {
        if (workingHours < 0 || hourlyRate < 0) {
            System.out.println("Invalid work details!");
            return;
        }
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return workingHours * hourlyRate;
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}
