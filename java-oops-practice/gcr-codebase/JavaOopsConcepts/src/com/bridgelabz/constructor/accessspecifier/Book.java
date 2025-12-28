package com.bridgelabz.constructor.accessspecifier;

class Book {

    public String ISBN;
    protected String title;
    private String author;

    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter and Setter for private author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

// Subclass
class EBook extends Book {

    EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    void displayBookInfo() {
        System.out.println("ISBN: " + ISBN);     // public
        System.out.println("Title: " + title);   // protected
        System.out.println("Author: " + getAuthor());
    }

    public static void main(String[] args) {
        EBook ebook = new EBook("123-ABC", "Java Basics", "James");
        ebook.displayBookInfo();
    }
}
