package com.bridgelabz.tourmate;

public class InternationalTrip extends Trip {

    public InternationalTrip(String destination, int duration,
                              Transport transport, Hotel hotel, Activity activity) {
        super(destination, duration, transport, hotel, activity);
    }

    @Override
    public void book() {
        System.out.println("International trip to " + destination + " booked..️");
        System.out.println("Passport & visa verified");
        System.out.println("Total Budget: $" + budget);
    }

    @Override
    public void cancel() {
        System.out.println("International trip cancelled");
    }
}
