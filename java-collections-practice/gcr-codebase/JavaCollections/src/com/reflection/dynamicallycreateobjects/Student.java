package com.reflection.dynamicallycreateobjects;

public class Student {
	 private String name;
	    private int roll;

	    public Student() {
	        this.name = "Meraaz";
	        this.roll = 10101;
	    }

	    public void show() {
	        System.out.println("Name: " + name);
	        System.out.println("Roll: " + roll);
	    }
}
