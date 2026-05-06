package com.inheritance.hierarchicalinheritance.schoolsystem;

public abstract class Person {

    protected String name;
    protected int age;

    public void setDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

	public abstract void displayRole() ;
}