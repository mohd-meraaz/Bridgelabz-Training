package com.bridgelabz.campusconnect;

public class Faculty extends Person {

    private String department;
    private String designation;

    Faculty(String name, String email, String id, String department, String designation) {
        super(name, email, id);
        this.department = department;
        this.designation = designation;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Department : " + department);
        System.out.println("Designation : " + designation);
    }
}
