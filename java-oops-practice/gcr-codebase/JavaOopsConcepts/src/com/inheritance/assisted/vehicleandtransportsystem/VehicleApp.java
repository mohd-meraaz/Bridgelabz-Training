package com.inheritance.assisted.vehicleandtransportsystem;
import java.util.Scanner;

public class VehicleApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Vehicle[] vehicles = new Vehicle[100]; 
        int count = 0;

        while (true) {
            System.out.println("\n\t===== Vehicle Management System =====");
            System.out.println("1. Add Car");
            System.out.println("2. Add Truck");
            System.out.println("3. Add Motorcycle");
            System.out.println("4. Display All Vehicles");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (count >= vehicles.length) {
                        System.out.println("Vehicle storage is full.");
                        break;
                    }

                    Car car = new Car();

                    System.out.print("Enter max speed: ");
                    car.maxSpeed = sc.nextInt();
                    

                    System.out.print("Enter Model name : ");
                    car.modelName = sc.nextLine();


                    sc.nextLine(); // consume newline
                    System.out.print("Enter fuel type: ");
                    car.fuelType = sc.nextLine();

                    System.out.print("Enter seat capacity: ");
                    car.seatCapacity = sc.nextInt();

                    vehicles[count++] = car;
                    System.out.println("Car added successfully!");
                    break;

                case 2:
                    if (count >= vehicles.length) {
                        System.out.println("Vehicle storage is full.");
                        break;
                    }

                    Truck truck = new Truck();
                    System.out.print("Enter max speed: ");
                    truck.maxSpeed = sc.nextInt();
                    
                    System.out.print("Enter Model name : ");
                    truck.modelName = sc.nextLine();


                    sc.nextLine();
                    System.out.print("Enter fuel type: ");
                    truck.fuelType = sc.nextLine();

                    System.out.print("Enter load capacity (tons): ");
                    truck.loadCapacity = sc.nextInt();

                    vehicles[count++] = truck;
                    System.out.println("Truck added successfully!");
                    break;

                case 3:
                    if (count >= vehicles.length) {
                        System.out.println("Vehicle storage is full.");
                        break;
                    }

                    Motercycle bike = new Motercycle();

                    System.out.print("Enter max speed: ");
                    bike.maxSpeed = sc.nextInt();
                    System.out.print("Enter Model name : ");
                    bike.modelName = sc.nextLine();

                    sc.nextLine();
                    System.out.print("Enter fuel type: ");
                    bike.fuelType = sc.nextLine();

                    System.out.print("Has carrier? (true/false): ");
                    bike.hasCarrier = sc.nextBoolean();

                    vehicles[count++] = bike;
                    System.out.println("Motorcycle added successfully!");
                    break;

                case 4:
                    if (count == 0) {
                        System.out.println("No vehicles added yet.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            vehicles[i].displayInfo(); 
                            System.out.println("------------------");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting application...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
