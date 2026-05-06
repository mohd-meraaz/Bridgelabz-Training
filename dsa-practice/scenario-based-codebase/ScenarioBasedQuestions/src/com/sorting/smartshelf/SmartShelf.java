package com.sorting.smartshelf;

public class SmartShelf {

    public static void insertionSortByTitle(Book[] books) {

        for (int i = 1; i < books.length; i++) {

            Book key = books[i];
            int j = i - 1;

            // Shift books that are alphabetically greater than key
            while (j >= 0 &&
                   books[j].getTitle()
                           .compareToIgnoreCase(key.getTitle()) > 0) {

                books[j + 1] = books[j];
                j--;
            }

            // Insert key at correct position
            books[j + 1] = key;
        }
    }
}
