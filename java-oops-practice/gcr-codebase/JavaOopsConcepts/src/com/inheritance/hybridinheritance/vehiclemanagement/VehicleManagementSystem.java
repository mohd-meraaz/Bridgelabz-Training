package com.inheritance.hybridinheritance.vehiclemanagement;

import java.util.Scanner;

public class VehicleManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Vehicle vehicle = null; // parent reference (polymorphism)

        while (true) {
            System.out.println("\n===== Vehicle Management System =====");
            System.out.println("1. Create Electric Vehicle");
            System.out.println("2. Create Petrol Vehicle");
            System.out.println("3. Display Vehicle Details");
            System.out.println("4. Perform Vehicle Action");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    ElectricVehicle ev = new ElectricVehicle();

                    System.out.print("Enter Vehicle Name: ");
                    String evName = sc.nextLine();

                    System.out.print("Enter Max Speed: ");
                    int evSpeed = sc.nextInt();

                    ev.setVehicleDetails(evName, evSpeed);
                    vehicle = ev;

                    System.out.println("Electric Vehicle created successfully!");
                    break;

                case 2:
                    PetrolVehicle pv = new PetrolVehicle();

                    System.out.print("Enter Vehicle Name: ");
                    String pvName = sc.nextLine();

                    System.out.print("Enter Max Speed: ");
                    int pvSpeed = sc.nextInt();

                    pv.setVehicleDetails(pvName, pvSpeed);
                    vehicle = pv;

                    System.out.println("Petrol Vehicle created successfully!");
                    break;

                case 3:
                    if (vehicle != null) {
                        vehicle.displayVehicleDetails(); // polymorphism
                    } else {
                        System.out.println("No vehicle created yet.");
                    }
                    break;

                case 4:
                    if (vehicle instanceof ElectricVehicle) {
                        ((ElectricVehicle) vehicle).chargeVehicle();
                    } else if (vehicle instanceof PetrolVehicle) {
                        ((PetrolVehicle) vehicle).refuel();
                    } else {
                        System.out.println("No vehicle available.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting Vehicle Management System...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
