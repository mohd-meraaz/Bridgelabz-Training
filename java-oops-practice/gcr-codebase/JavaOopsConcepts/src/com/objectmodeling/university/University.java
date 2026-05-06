package com.objectmodeling.university;

import java.util.ArrayList;

public class University {

    private String universityName;
    private ArrayList<Department> departments;
    private ArrayList<Faculty> faculties; // aggregation

    University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    // Composition: University owns Department
    void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    // Aggregation: University references Faculty
    void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    // Assign faculty to department
    void assignFacultyToDepartment(String deptName, Faculty faculty) {
        for (Department d : departments) {
            if (d.getDepartmentName().equals(deptName)) {
                d.addFaculty(faculty);
                return;
            }
        }
        System.out.println("Department not found: " + deptName);
    }

    void displayUniversity() {
        System.out.println("\nUniversity: " + universityName);
        System.out.println("Departments:");

        for (Department d : departments) {
            d.displayDepartment();
        }
    }
}
