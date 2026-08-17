package com.day12.classwork;

public class Student {
    private int rollNumber;
    private String name;
    private String gender;
    private int age;
    static int totalStudent = 0; // static variable , refers to class

    Student(int rollNumber, String name, String gender, int age) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.gender = gender;
        this.age = age;
        totalStudent++;
    }

    Student(Student student) {
        this.rollNumber = student.rollNumber;
        this.name = student.name;
        this.gender = student.gender;
        this.age = student.age;
        totalStudent++;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public static int getTotalStudent() {
        return totalStudent;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


