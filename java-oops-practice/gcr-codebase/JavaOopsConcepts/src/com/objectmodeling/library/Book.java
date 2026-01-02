package com.objectmodeling.assistedproblems;

public class Book {
	private String bookName;
	private String author;
	private double price;
	
	//Constructors
	public Book(String bookName, String author, double price) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }
	
	public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    
    }
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	// Method expected by Library
	public void displayDetails() {
		System.out.println("The name of the book is : "+bookName);
		System.out.println("The author of the book "+bookName+" is "+author);
		System.out.println("The price of the book "+bookName+" is "+price);
	}
	

}
