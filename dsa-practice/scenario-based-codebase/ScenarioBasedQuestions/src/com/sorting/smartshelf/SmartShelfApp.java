package com.sorting.smartshelf;

public class SmartShelfApp {

    public static void main(String[] args) {

        Book[] readingList = {
            new Book("Algorithms", "CLRS"),
            new Book("Data Structures", "Mark Allen Weiss"),
            new Book("Computer Networks", "Tanenbaum"),
            new Book("Artificial Intelligence", "Russell"),
            new Book("Operating Systems", "Silberschatz")
        };

        System.out.println("Before Sorting:");
        for (Book book : readingList) {
            book.display();
        }

        SmartShelf.insertionSortByTitle(readingList);

        System.out.println("\nAfter Sorting (Alphabetical Order):");
        for (Book book : readingList) {
            book.display();
        }
    }
}
