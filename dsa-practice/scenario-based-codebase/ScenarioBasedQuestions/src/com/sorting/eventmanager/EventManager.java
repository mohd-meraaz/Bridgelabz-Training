package com.sorting.eventmanager;

public class EventManager {

    public static void main(String[] args) {

        Event[] events = {
            new Event("Wedding", 23321),
            new Event("BirthDay", 4321),
            new Event("Party", 54544),
            new Event("Anniversary", 32323)
        };

        // Sort events by price
        Manage.quickSort(events, 0, events.length - 1);

        // Display sorted events
        for (Event e : events) {
            System.out.println("Event Name: " + e.getEventName());
            System.out.println("Price: " + e.getPrice());
            System.out.println();
        }
    }
}
