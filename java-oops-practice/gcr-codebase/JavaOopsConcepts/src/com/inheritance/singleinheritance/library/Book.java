package com.inheritance.singleinheritance.library;

/*
 * Book class represents a general book in the library.
 * This is the SUPERCLASS.
 * It contains common details that every book must have.
 */
public class Book {

    // Title of the book
    protected String title;

    // Year in which the book was published
    protected int publicationYear;

    /*
     * This method is used to set basic book details.
     * It can be reused by child classes.
     */
    public void setBookDetails(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}
