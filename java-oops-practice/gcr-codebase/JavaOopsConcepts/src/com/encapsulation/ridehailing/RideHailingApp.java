package com.encapsulation.ridehailing;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Main application class for Ride-Hailing System.
 * Demonstrates polymorphism using Vehicle reference.
 */
public class RideHailingApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Ride-Hailing Application =====");
            System.out.println("1. Add Car");
            System.out.println("2. Add Bike");
            System.out.println("3. Add Auto");
            System.out.println("4. Calculate Fare");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    Car car = new Car();
                    addVehicle(sc, car);
                    vehicles.add(car);
                    System.out.println("Car added!");
                    break;

                case 2:
                    Bike bike = new Bike();
                    addVehicle(sc, bike);
                    vehicles.add(bike);
                    System.out.println("Bike added!");
                    break;

                case 3:
                    Auto auto = new Auto();
                    addVehicle(sc, auto);
                    vehicles.add(auto);
                    System.out.println("Auto added!");
                    break;

                case 4:
                    if (vehicles.isEmpty()) {
                        System.out.println("No vehicles available.");
                        break;
                    }

                    System.out.print("Enter distance (km): ");
                    double distance = sc.nextDouble();
                    sc.nextLine();

                    for (Vehicle v : vehicles) {
                        System.out.println("\n---------------------");
                        v.getVehicleDetails();
                        System.out.println("Current Location: " +
                                ((GPS) v).getCurrentLocation());
                        System.out.println("Fare: " + v.calculateFare(distance));
                    }
                    break;

                case 5:
                    System.out.println("Exiting Ride-Hailing Application...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // Helper method
    private static void addVehicle(Scanner sc, Vehicle v) {
        System.out.print("Enter Vehicle ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Driver Name: ");
        String driver = sc.nextLine();

        System.out.print("Enter Rate per Km: ");
        double rate = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Current Location: ");
        String location = sc.nextLine();

        v.setVehicleDetails(id, driver, rate);
        ((GPS) v).updateLocation(location);
    }
}
