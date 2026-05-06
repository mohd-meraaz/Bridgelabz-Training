package com.bridgelabz.EventEase;

public class ConferenceEvent extends Event {

    public ConferenceEvent(String eventName, String location, String date,
                            int attendees, User organizer, double serviceCost) {
        super(eventName, location, date, attendees, organizer, serviceCost, 1000);
    }

    @Override
    public void schedule() {
        System.out.println("Conference scheduled with professional setup 🏢");
    }

    @Override
    public void reschedule(String newDate) {
        updateDate(newDate);
        System.out.println("Conference rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Conference cancelled");
    }
}
