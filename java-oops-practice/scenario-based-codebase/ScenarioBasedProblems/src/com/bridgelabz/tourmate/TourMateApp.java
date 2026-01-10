package com.bridgelabz.tourmate;

public class TourMateApp {
    public static void main(String[] args) {

        Transport flight = new Transport(25000);
        Hotel hotel = new Hotel(15000);
        Activity activity = new Activity(5000);

        Trip trip1 = new DomesticTrip(
                "Goa", 5, flight, hotel, activity);

        Trip trip2 = new InternationalTrip(
                "Paris", 7, flight, hotel, activity);

        trip1.book();
        trip2.book();
    }
}
