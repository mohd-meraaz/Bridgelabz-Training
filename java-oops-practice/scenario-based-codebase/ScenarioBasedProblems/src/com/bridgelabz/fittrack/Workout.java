package com.bridgelabz.fittrack;

public abstract class Workout implements ITrackable {
 protected String type;
 protected int duration;
 protected double caloriesBurned;

 // Constructor
 public Workout(String type, int duration) {
     this.type = type;
     this.duration = duration;
     this.caloriesBurned = calculateCalories(); 
 }

 // Abstract differs by workout type
 public abstract double calculateCalories();

 // Implement ITrackable methods
 @Override
 public void startWorkout() {
     System.out.println("Starting " + type + " workout.");
 }

 @Override
 public void stopWorkout() {
     System.out.println("Stopping " + type + " workout.");
 }

 // Getters 
 public String getType() {
     return type;
 }

 public int getDuration() {
     return duration;
 }

 public double getCaloriesBurned() {
     return caloriesBurned;
 }
}