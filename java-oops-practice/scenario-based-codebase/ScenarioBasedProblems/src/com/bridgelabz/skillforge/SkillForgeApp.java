package com.bridgelabz.skillforge;

public class SkillForgeApp {
    public static void main(String[] args) {

        Instructor instructor = new Instructor("Titu", "vishal@skillforge.com");
        Student student = new Student("Amit", "amit@gmail.com");

        Course course = new Course(
                "Java Fundamentals",
                instructor,
                new String[]{"OOP", "Collections", "Streams"});

        student.updateProgress(3, 3);
        student.assignScore(70);

        course.generateCertificate(student);

        Course advCourse = new AdvancedCourse(
                "Java Backend Mastery",
                instructor,
                new String[]{"Spring", "JPA", "Microservices"});

        advCourse.generateCertificate(student);
    }
}
