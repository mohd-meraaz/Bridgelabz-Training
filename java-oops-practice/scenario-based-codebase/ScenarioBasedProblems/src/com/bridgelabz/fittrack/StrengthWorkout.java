package com.bridgelabz.fittrack;


public class StrengthWorkout extends Workout {
public StrengthWorkout(int duration) {
   super("Strength", duration);
}

@Override
public double calculateCalories() {
   return duration * 8.0;
}
}
