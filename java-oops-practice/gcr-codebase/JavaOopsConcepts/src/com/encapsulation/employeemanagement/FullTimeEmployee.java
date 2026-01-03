package com.encapsulation.employeemanagement;

/*
 * Represents a full-time employee.
 */
public class FullTimeEmployee extends Employee implements Department {

    @Override
    public double calculateSalary() {
        return getBaseSalary();
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
