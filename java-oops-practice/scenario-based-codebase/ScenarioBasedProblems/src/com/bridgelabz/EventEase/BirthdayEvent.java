package com.bridgelabz.EventEase;
public class BirthdayEvent extends Event {

    public BirthdayEvent(String eventName, String location, String date,
                         int attendees, User organizer, double serviceCost) {
        super(eventName, location, date, attendees, organizer, serviceCost, 500);
    }

    @Override
    public void schedule() {
        System.out.println("Birthday Event scheduled with fun activities 🎉");
    }

    @Override
    public void reschedule(String newDate) {
        updateDate(newDate);
        System.out.println("Birthday Event rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Birthday Event cancelled");
    }
}
