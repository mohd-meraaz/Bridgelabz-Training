package com.bridgelabz.constructor.accessspecifier;

//Subclass
class EBook extends Book {

 EBook(String ISBN, String title, String author) {
     super(ISBN, title, author);
 }

 void displayBookInfo() {
     System.out.println("ISBN: " + ISBN);     // public
     System.out.println("Title: " + title);   // protected
     System.out.println("Author: " + getAuthor());
 }

 
}