package com.bridgelabz.skillforge;

public class AdvancedCourse extends Course {

    public AdvancedCourse(String title, Instructor instructor, String[] modules) {
        super(title, instructor, modules);
    }

    @Override
    public void generateCertificate(Student student) {
        if (student.getProgress() == 100 && student.getScore() >= 75) {
            System.out.println("🏆 Advanced Certificate Awarded");
            System.out.println("Student: " + student.name);
            System.out.println("Course Level: Advanced");
        } else {
            System.out.println("Advanced certification requirements not met");
        }
    }
}
