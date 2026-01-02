package com.objectmodeling.assistedproblems;

import java.util.ArrayList;

public class Library {
	private ArrayList<Book> books= new ArrayList<>(); 
	// Constructor
    public Library() {
        books = new ArrayList<>();
    }
    
 // Add book to library
    public void addBook(Book book) {
        books.add(book);
    }

    // Display all books
    public void displayLibraryBooks() {
        for (Book value : books) {
        	value.displayDetails();
            System.out.println("------------");
        }
    }

	
	

}
