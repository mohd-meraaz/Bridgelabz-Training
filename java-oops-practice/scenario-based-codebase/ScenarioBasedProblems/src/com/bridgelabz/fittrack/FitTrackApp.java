package com.bridgelabz.fittrack;

import java.util.Scanner;

public class FitTrackApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserProfile user = null; 

        while (true) {
            System.out.println("\n--- FitTrack Menu ---");
            System.out.println("1. Create User Profile");
            System.out.println("2. Add Cardio Workout");
            System.out.println("3. Add Strength Workout");
            System.out.println("4. View Progress");
            System.out.println("5. View Workout Logs");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    // Create User Profile
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter weight: ");
                    double weight = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter goal: ");
                    String goal = scanner.nextLine();
                    user = new UserProfile(name, age, weight, goal);
                    System.out.println("User profile created successfully!");
                    break;

                case 2:
                    // Add Cardio Workout
                    if (user == null) {
                        System.out.println("Please create a user profile first.");
                        break;
                    }
                    System.out.print("Enter duration for Cardio workout (minutes): ");
                    int cardioDuration = scanner.nextInt();
                    CardioWorkout cardio = new CardioWorkout(cardioDuration);
                    cardio.startWorkout();
                    cardio.stopWorkout();
                    user.addWorkout(cardio);
                    System.out.println("Cardio workout added!");
                    break;

                case 3:
                    // Add Strength Workout
                    if (user == null) {
                        System.out.println("Please create a user profile first.");
                        break;
                    }
                    System.out.print("Enter duration for Strength workout (minutes): ");
                    int strengthDuration = scanner.nextInt();
                    StrengthWorkout strength = new StrengthWorkout(strengthDuration);
                    strength.startWorkout();
                    strength.stopWorkout();
                    user.addWorkout(strength);
                    System.out.println("Strength workout added!");
                    break;

                case 4:
                    // View Progress
                    if (user == null) {
                        System.out.println("Please create a user profile first.");
                        break;
                    }
                    System.out.println("Total Calories Burned: " + user.getTotalCaloriesBurned());
                    System.out.println("Progress (Target - Burned): " + user.getProgress());
                    break;

                case 5:
                    // View Workout Logs
                    if (user == null) {
                        System.out.println("Please create a user profile first.");
                        break;
                    }
                    System.out.println("Workout Logs:");
                    for (String log : user.getWorkoutLogs()) {
                        System.out.println(log);
                    }
                    break;

                case 6:
                    // Exit
                    System.out.println("Exiting FitTrack. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}