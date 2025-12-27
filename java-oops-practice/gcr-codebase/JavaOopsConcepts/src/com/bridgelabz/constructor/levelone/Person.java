package com.bridgelabz.constructor.levelone;

public class Person {
	
	String name ;
	double age;
	
	Person(String name,	double age){
		this.name=name;
		this.age = age;
	}
	
	Person(Person person){
		this.name=person.name;
		this.age = person.age;
	}
	
	public void display() {
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);	
	}
	
	
	public static void main(String[] args) {
		Person person = new Person("Meraaz", 22.0);
		
		Person copyPerson = new Person(person);
		
		System.out.println("Details of person 1");
		person.display();
		System.out.println("Details of copied person ");
		copyPerson.display();
		
		

	}

}
