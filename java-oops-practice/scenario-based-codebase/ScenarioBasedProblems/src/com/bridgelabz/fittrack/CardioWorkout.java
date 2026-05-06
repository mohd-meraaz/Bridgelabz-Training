package com.bridgelabz.fittrack;

public class CardioWorkout extends Workout {
 public CardioWorkout(int duration) {
     super("Cardio", duration);
 }

 @Override
 public double calculateCalories() {
     return duration * 10.0;
 }
}

