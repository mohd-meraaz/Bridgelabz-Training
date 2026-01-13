package com.trafficmanager;

public class Main {
    public static void main(String[] args) {
        TrafficManager manager = new TrafficManager(3);

        manager.arrive("CAR-101");
        manager.arrive("CAR-102");
        manager.arrive("CAR-103");
        manager.arrive("CAR-104"); // goes to queue

        manager.displayRoundabout();
        manager.displayQueue();

        manager.exit("CAR-102");

        manager.displayRoundabout();
        manager.displayQueue();
    }
}
