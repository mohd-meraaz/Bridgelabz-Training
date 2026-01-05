package com.bridgelabz.cabbygo;

import java.util.Scanner;
public class CabbyGoApp {



	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        Vehicle vehicle = null;
	        Driver driver = null;
	        Customer customer = null;

	        while (true) {
	            System.out.println("\n===== Ride Hailing System =====");
	            System.out.println("1. Create Vehicle");
	            System.out.println("2. Create Driver");
	            System.out.println("3. Create Customer");
	            System.out.println("4. Display Driver Info");
	            System.out.println("5. Book Ride");
	            System.out.println("6. End Ride & Rate Driver");
	            System.out.println("7. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = sc.nextInt();
	            sc.nextLine(); // clear buffer

	            switch (choice) {

	                case 1:
	                    System.out.print("Enter Vehicle Number: ");
	                    String vehicleNo = sc.nextLine();

	                    vehicle = new Sedan(vehicleNo);
	                    System.out.println("Vehicle created successfully!");
	                    break;

	                case 2:
	                    if (vehicle == null) {
	                        System.out.println("Please create vehicle first.");
	                        break;
	                    }

	                    System.out.print("Enter Driver Name: ");
	                    String dName = sc.nextLine();

	                    System.out.print("Enter Driver ID: ");
	                    int dId = sc.nextInt();

	                    System.out.print("Enter Driver Rating: ");
	                    double rating = sc.nextDouble();

	                    sc.nextLine(); // clear buffer
	                    System.out.print("Enter Driver Location: ");
	                    String location = sc.nextLine();

	                    System.out.print("Enter Experience (years): ");
	                    int exp = sc.nextInt();

	                    driver = new Driver(dName, dId, rating, location, exp, vehicle);
	                    System.out.println("Driver created successfully!");
	                    break;

	                case 3:
	                    if (driver == null) {
	                        System.out.println("Please create driver first.");
	                        break;
	                    }

	                    System.out.print("Enter Customer Name: ");
	                    String cName = sc.nextLine();

	                    System.out.print("Enter Wallet Balance: ");
	                    double balance = sc.nextDouble();

	                    customer = new Customer(cName, balance, driver);
	                    System.out.println("Customer created successfully!");
	                    break;

	                case 4:
	                    if (driver != null) {
	                        System.out.println("----------------------------");
	                        driver.displayDriverInfo();
	                        System.out.println("----------------------------");
	                    } else {
	                        System.out.println("Driver not available.");
	                    }
	                    break;

	                case 5:
	                    if (customer != null) {
	                        customer.bookRide();
	                    } else {
	                        System.out.println("Customer not available.");
	                    }
	                    break;

	                case 6:
	                    if (customer != null) {
	                        System.out.print("Enter rating for driver: ");
	                        double newRating = sc.nextDouble();

	                        System.out.println("----------------------------");
	                        customer.endRide(newRating);
	                        System.out.println("----------------------------");
	                    } else {
	                        System.out.println("No active ride.");
	                    }
	                    break;

	                case 7:
	                    System.out.println("Exiting Ride Application...");
	                    sc.close();
	                    System.exit(0);

	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }
	        }
	    }
	}
	                        
	                        
	                        
	                        
	                        
	                        
	                        
	                        
	                        
	                        
