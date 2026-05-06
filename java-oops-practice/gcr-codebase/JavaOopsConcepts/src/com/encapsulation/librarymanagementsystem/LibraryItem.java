package com.encapsulation.librarymanagementsystem;

/*
 * Abstract base class for all library items.
 * Demonstrates encapsulation and abstraction.
 */
public abstract class LibraryItem {

    private int itemId;
    private String title;
    private String author;

    // Sensitive borrower data (encapsulated)
    private String borrowerName;
    private boolean isAvailable = true;

    // Encapsulation using setter
    public void setItemDetails(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Protected methods for subclasses
    protected void setBorrower(String borrowerName) {
        this.borrowerName = borrowerName;
        this.isAvailable = false;
    }

    protected boolean isAvailable() {
        return isAvailable;
    }

    protected void makeAvailable() {
        borrowerName = null;
        isAvailable = true;
    }

    // Abstract method
    public abstract int getLoanDuration();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }
}
