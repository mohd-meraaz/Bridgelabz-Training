package com.bridgelabz.fittrack;

import java.util.ArrayList;
import java.util.List;

public class UserProfile {
    private String name;
    private int age;
    private double weight;
    private String goal;
    private double dailyTarget; 
    private List<Workout> workouts; 

    // Default constructor 
    public UserProfile() {
        this.name = "Anonymous";
        this.age = 0;
        this.weight = 0.0;
        this.goal = "General Fitness"; // Default goal
        this.dailyTarget = 500.0; // Default daily calorie target
        this.workouts = new ArrayList<>();
    }

    // Constructor with custom parameters
    public UserProfile(String name, int age, double weight, String goal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = goal;
        this.dailyTarget = 500.0; 
        this.workouts = new ArrayList<>();
    }

    // Getters and setters 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public double getDailyTarget() {
        return dailyTarget;
    }

    public void setDailyTarget(double dailyTarget) {
        this.dailyTarget = dailyTarget;
    }

    // Method to add a workout 
    public void addWorkout(Workout workout) {
        workouts.add(workout);
    }

    // Method to compute total calories burned 
    public double getTotalCaloriesBurned() {
        double total = 0.0;
        for (Workout w : workouts) {
            total += w.getCaloriesBurned();
        }
        return total;
    }

    // Operator-like computation: progress as dailyTarget - caloriesBurned
    public double getProgress() {
        return dailyTarget - getTotalCaloriesBurned();
    }

    // Method to get workout logs without exposing the private list directly (access modifiers)
    public List<String> getWorkoutLogs() {
        List<String> logs = new ArrayList<>();
        for (Workout w : workouts) {
            logs.add(w.getType() + " workout: " + w.getDuration() + " minutes, " + w.getCaloriesBurned() + " calories burned.");
        }
        return logs;
    }
}