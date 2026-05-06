package com.bridgelabz.EventEase;

public class EventEaseApp {
    public static void main(String[] args) {

        User user = new User("Rohit", "rohit@email.com", "9876543210");

        Event event1 = new BirthdayEvent(
                "Rohit's Birthday", "Pune", "15-02-2026", 50, user, 3000);

        Event event2 = new ConferenceEvent(
                "Tech Conference", "Mumbai", "20-03-2026", 200, user, 8000);

        event1.schedule();
        System.out.println("Total Cost: " + event1.calculateTotalCost());

        event2.schedule();
        System.out.println("Total Cost: " + event2.calculateTotalCost());
    }
}
