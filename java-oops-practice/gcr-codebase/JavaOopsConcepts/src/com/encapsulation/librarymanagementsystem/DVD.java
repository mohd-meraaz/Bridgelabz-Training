package com.encapsulation.librarymanagementsystem;

/*
 * DVD item with shortest loan duration.
 */
public class DVD extends LibraryItem implements Reservable {

    @Override
    public int getLoanDuration() {
        return 3; // 3 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable()) {
            setBorrower(borrowerName);
            System.out.println("DVD reserved successfully.");
        } else {
            System.out.println("DVD is not available.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}
