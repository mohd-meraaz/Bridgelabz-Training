package com.encapsulation.librarymanagementsystem;

/*
 * Interface for reservable library items.
 */
public interface Reservable {

    void reserveItem(String borrowerName);

    boolean checkAvailability();
}
