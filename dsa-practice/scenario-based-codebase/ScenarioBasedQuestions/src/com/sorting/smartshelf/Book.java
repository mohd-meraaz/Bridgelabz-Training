package com.sorting.smartshelf;

public class Book {

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}
