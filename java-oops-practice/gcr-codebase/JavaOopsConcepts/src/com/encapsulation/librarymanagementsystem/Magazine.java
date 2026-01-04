package com.encapsulation.librarymanagementsystem;

/*
 * Magazine item with shorter loan duration.
 */
public class Magazine extends LibraryItem implements Reservable {

    @Override
    public int getLoanDuration() {
        return 7; // 7 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable()) {
            setBorrower(borrowerName);
            System.out.println("Magazine reserved successfully.");
        } else {
            System.out.println("Magazine is not available.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}
