package com.objectmodeling.university;

public class Faculty {

    private String facultyName;
    private String facultyId;

    Faculty(String facultyName, String facultyId) {
        this.facultyName = facultyName;
        this.facultyId = facultyId;
    }

    void displayFaculty() {
        System.out.println("Faculty Name: " + facultyName + ", ID: " + facultyId);
    }

    String getName() {
        return facultyName;
    }

    String getId() {
        return facultyId;
    }
}
