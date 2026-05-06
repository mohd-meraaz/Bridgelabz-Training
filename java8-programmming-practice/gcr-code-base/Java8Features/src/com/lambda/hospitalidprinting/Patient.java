package com.lambda.hospitalidprinting;

public class Patient {
	String name;
	String id;
	public Patient(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Patient [name=" + name + ", id=" + id + "]";
	}
	
}
