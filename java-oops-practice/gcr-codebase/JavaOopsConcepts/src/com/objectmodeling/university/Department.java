package com.objectmodeling.university;

import java.util.ArrayList;

public class Department {

    private String departmentName;
    private ArrayList<Faculty> faculties;

    Department(String deptName) {
        this.departmentName = deptName;
        this.faculties = new ArrayList<>();
    }

    void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    String getDepartmentName() {
        return departmentName;
    }

    void displayDepartment() {
        System.out.println("\nDepartment Name: " + departmentName);
        System.out.println("Faculty Members Count: " + faculties.size());

        if (faculties.isEmpty()) {
            System.out.println("No faculty assigned.");
        } else {
            System.out.println("Faculties:");
            for (Faculty f : faculties) {
                f.displayFaculty();
            }
        }
    }
}
