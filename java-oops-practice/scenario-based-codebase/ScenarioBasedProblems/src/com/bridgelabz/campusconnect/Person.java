package com.bridgelabz.campusconnect;

// ● Person (base class): common fields like name, email, id.
public class Person {
	private String name ;
	private String email ;
	private String id;
	
	// Constructor
	Person(String name, String email, String id){
		this.name = name;
		this.email = email;
		this.id = id;
	}
	
	//method to update email
	public void updateEmail(String email) {
		this.email = email;
	}

//method to print details
	public void printDetails() {
		// TODO Auto-generated method stub
		System.out.println("Name : " + name);
		System.out.println("Id : " + id);
		System.out.println("email : " + email);
		
	}

}
