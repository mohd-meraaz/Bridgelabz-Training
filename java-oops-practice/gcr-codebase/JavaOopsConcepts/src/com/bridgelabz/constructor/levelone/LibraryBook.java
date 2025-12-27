package com.bridgelabz.constructor.levelone;

public class LibraryBook {
	String title;
    String author;
    double price;
    boolean available;

    // Constructor
    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    // Method to borrow book
    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is currently unavailable.");
        }
    }

    
    void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("Available: " + available);
        System.out.println("----------------------");
    }
    
    public static void main(String[] args) {
    	LibraryBook book = new LibraryBook("Title", "Author",345.45);
    	book.borrowBook();
    	book.displayBookDetails();
    	
    }

}
