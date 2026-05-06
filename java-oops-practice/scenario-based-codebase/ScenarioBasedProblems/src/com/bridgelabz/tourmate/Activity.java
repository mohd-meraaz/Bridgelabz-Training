package com.bridgelabz.tourmate;

public class Activity {
    private double cost;

    public Activity(double cost) {
        this.cost = cost;
    }

    protected double getCost() {
        return cost;
    }
}
