package com.bridgelabz.EventEase;
public abstract class Event implements ISchedulable {

    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    private final int eventId;     // cannot be modified once assigned
    private double venueCost;
    private double serviceCost;
    private double discount;

    protected User organizer;

    private static int idCounter = 1000;

    // Constructor without services
    public Event(String eventName, String location, String date, int attendees, User organizer) {
        this.eventId = ++idCounter;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.organizer = organizer;
        this.venueCost = 5000;
    }

    // Constructor with services
    public Event(String eventName, String location, String date, int attendees,
                 User organizer, double serviceCost, double discount) {
        this(eventName, location, date, attendees, organizer);
        this.serviceCost = serviceCost;
        this.discount = discount;
    }

    // Cost calculation using operators
    public double calculateTotalCost() {
        return venueCost + serviceCost - discount;
    }

    public int getEventId() {
        return eventId;
    }

    protected void updateDate(String newDate) {
        this.date = newDate;
    }
}
