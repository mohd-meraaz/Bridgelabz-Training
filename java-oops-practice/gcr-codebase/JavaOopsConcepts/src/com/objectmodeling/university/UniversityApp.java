package com.objectmodeling.university;

public class UniversityApp {

    public static void main(String[] args) {

        // Faculties exist independently (Aggregation)
        Faculty f1 = new Faculty("Dr. Sharma", "CSE01");
        Faculty f2 = new Faculty("Prof. Tiwari", "BIO01");

        // University and Departments (Composition)
        University uni = new University("Technocrats Institute of Technology");
        uni.addDepartment("Computer Science");
        uni.addDepartment("Biology");

        // Add faculties to university
        uni.addFaculty(f1);
        uni.addFaculty(f2);

        // Assign faculty to departments
        uni.assignFacultyToDepartment("Computer Science", f1);
        uni.assignFacultyToDepartment("Biology", f2);

        // Display
        uni.displayUniversity();

        // Deleting university deletes departments (composition)
        uni = null;

        // Faculties still exist
        System.out.println("\nFaculty members still exist independently:");
        f1.displayFaculty();
        f2.displayFaculty();
    }
}
