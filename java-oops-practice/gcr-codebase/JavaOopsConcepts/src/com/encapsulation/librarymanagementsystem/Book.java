package com.encapsulation.librarymanagementsystem;

/*
 * Book item with standard loan duration.
 */
public class Book extends LibraryItem implements Reservable {

    @Override
    public int getLoanDuration() {
        return 14; // 14 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable()) {
            setBorrower(borrowerName);
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}
