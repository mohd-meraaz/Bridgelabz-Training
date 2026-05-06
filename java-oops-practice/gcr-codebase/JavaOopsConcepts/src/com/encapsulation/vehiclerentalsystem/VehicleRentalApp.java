package com.encapsulation.vehiclerentalsystem;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Main application class for Vehicle Rental System.
 */
public class VehicleRentalApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Vehicle Rental System =====");
            System.out.println("1. Add Car");
            System.out.println("2. Add Bike");
            System.out.println("3. Add Truck");
            System.out.println("4. Calculate Rental & Insurance Cost");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    Car car = new Car();
                    addVehicle(sc, car);
                    vehicles.add(car);
                    System.out.println("Car added successfully!");
                    break;

                case 2:
                    Bike bike = new Bike();
                    addVehicle(sc, bike);
                    vehicles.add(bike);
                    System.out.println("Bike added successfully!");
                    break;

                case 3:
                    Truck truck = new Truck();
                    addVehicle(sc, truck);
                    vehicles.add(truck);
                    System.out.println("Truck added successfully!");
                    break;

                case 4:
                    if (vehicles.isEmpty()) {
                        System.out.println("No vehicles available.");
                        break;
                    }

                    System.out.print("Enter rental days: ");
                    int days = sc.nextInt();

                    for (Vehicle v : vehicles) {
                        System.out.println("\n----------------------");
                        v.displayVehicleDetails();

                        double rent = v.calculateRentalCost(days);
                        double insurance = ((Insurable) v).calculateInsurance();

                        System.out.println(((Insurable) v).getInsuranceDetails());
                        System.out.println("Rental Cost: ₹" + rent);
                        System.out.println("Total Cost: ₹" + (rent + insurance));
                    }
                    break;

                case 5:
                    System.out.println("Exiting Vehicle Rental System...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // Helper method
    private static void addVehicle(Scanner sc, Vehicle v) {
        System.out.print("Enter Vehicle Number: ");
        String number = sc.nextLine();

        System.out.print("Enter Vehicle Type: ");
        String type = sc.nextLine();

        System.out.print("Enter Rental Rate per Day: ");
        double rate = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Insurance Policy Number: ");
        String policy = sc.nextLine();

        v.setVehicleDetails(number, type, rate);
        v.setInsurancePolicyNumber(policy);
    }
}
