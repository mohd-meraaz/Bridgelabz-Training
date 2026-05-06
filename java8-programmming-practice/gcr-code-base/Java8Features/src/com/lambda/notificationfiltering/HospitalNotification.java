package com.lambda.notificationfiltering;

//Creating a class for patients
public class HospitalNotification {
	String name;
	Integer age;
	String priority;
	
	public HospitalNotification(String name, Integer age, String priority) {
		super();
		this.name = name;
		this.age = age;
		this.priority = priority;
	}
	public String toString() {
		return ("Name:- " + name + "\nAge :- "+age);
	}
}
