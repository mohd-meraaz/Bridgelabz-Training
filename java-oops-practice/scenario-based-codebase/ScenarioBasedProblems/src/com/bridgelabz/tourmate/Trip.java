package com.bridgelabz.tourmate;

public abstract class Trip implements IBookable {

    protected String destination;
    protected int duration;      // days
    protected double budget;

    protected Transport transport;
    protected Hotel hotel;
    protected Activity activity;

    public Trip(String destination, int duration,
                Transport transport, Hotel hotel, Activity activity) {

        this.destination = destination;
        this.duration = duration;
        this.transport = transport;
        this.hotel = hotel;
        this.activity = activity;

        this.budget = calculateTotalBudget();
    }

    // Operator-based budget calculation
    protected double calculateTotalBudget() {
        return transport.getCost() + hotel.getCost() + activity.getCost();
    }

    public double getBudget() {
        return budget;
    }
}
