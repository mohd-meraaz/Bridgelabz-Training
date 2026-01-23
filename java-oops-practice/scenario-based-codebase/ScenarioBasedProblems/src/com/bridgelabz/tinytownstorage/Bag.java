package com.bridgelabz.tinytownstorage;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Storable {

    private String id;
    private String color;
    private int capacity;
    private List<Ball> balls;

    public Bag(String id, String color, int capacity) {
        this.id = id;
        this.color = color;
        this.capacity = capacity;
        this.balls = new ArrayList<>();
    }

    // Add ball (capacity check)
    public boolean addBall(Ball ball) {
        if (balls.size() >= capacity) {
            System.out.println("Bag " + id + " is full. Cannot add ball.");
            return false;
        }
        balls.add(ball);
        return true;
    }

    // Remove ball by ID
    public boolean removeBall(String ballId) {
        for (Ball ball : balls) {
            if (ball.getId().equals(ballId)) {
                balls.remove(ball);
                return true;
            }
        }
        System.out.println("Ball not found in bag " + id);
        return false;
    }

    // Display all balls
    public void displayBalls() {
        System.out.println("Bag ID: " + id + " contains:");
        if (balls.isEmpty()) {
            System.out.println("No balls in this bag.");
        } else {
            for (Ball ball : balls) {
                System.out.println(ball);
            }
        }
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public int getBallCount() {
        return balls.size();
    }

    public int getCapacity() {
        return capacity;
    }
}
