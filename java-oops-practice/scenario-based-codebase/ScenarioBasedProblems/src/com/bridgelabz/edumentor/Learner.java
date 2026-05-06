package com.bridgelabz.edumentor;

public class Learner extends User implements ICertifiable {

    private String courseType; // short / full-time

    public Learner(String name, String email, String userId, String courseType) {
        super(name, email, userId);
        this.courseType = courseType;
    }

    @Override
    public void generateCertificate() {
        System.out.println("\n--- Certificate ---");
        System.out.println("Awarded to : " + name);

        if (courseType.equalsIgnoreCase("short")) {
            System.out.println("Course Type : Short-Term");
            System.out.println("Duration    : 4 Weeks");
        } else {
            System.out.println("Course Type : Full-Time");
            System.out.println("Duration    : 6 Months");
        }

        System.out.println("Status      : Completed");
    }
}
