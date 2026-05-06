package com.inheritance.singleinheritance.library;

/*
 * Author class extends Book.
 * This shows SINGLE INHERITANCE.
 * Author is a specific type of Book with extra details.
 */
public class Author extends Book {

    // Name of the author
    private String name;

    // Short description about the author
    private String bio;

    /*
     * Sets author-specific details.
     * These details are not part of the Book class.
     */
    public void setAuthorDetails(String name, String bio) {
        this.name = name;
        this.bio = bio;
    }

    /*
     * Displays complete information about the book and its author.
     * Accesses inherited variables from Book class.
     */
    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}
