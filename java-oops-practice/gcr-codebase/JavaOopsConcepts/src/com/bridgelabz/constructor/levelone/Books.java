package com.bridgelabz.constructor.levelone;

public class Books {
	
	String title;
	String author;
	int price;
	
	Books(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	Books(){
		System.out.println("Object Created");
	}
	
	public void display() {
		System.out.println("Title : " + this.title);
		System.out.println("Author : " + this.author);
		System.out.println("Price : " + this.price);
		
	}

	public static void main(String[] args) {
		Books Monk = new Books("The Monk Who Sold His Ferrari","Robin Sharma",225);
		Monk.display();
		
	}

}