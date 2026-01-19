package com.generics.smartmanagementsystem;

import java.util.Scanner;

public class SmartManagementApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Storage objects for each category
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();

        Display display = new Display();

        int choice;

        do {
            System.out.println("\n===== Smart Management System =====");
            System.out.println("1. Add Electronics");
            System.out.println("2. Add Furniture");
            System.out.println("3. Add Groceries");
            System.out.println("4. Display All Items");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Electronics Name: ");
                    String eName = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double ePrice = sc.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int eQty = sc.nextInt();

                    electronicsStorage.addItem(
                            new Electronics(eName, ePrice, eQty));
                    break;

                case 2:
                    System.out.print("Enter Furniture Name: ");
                    String fName = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double fPrice = sc.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int fQty = sc.nextInt();

                    furnitureStorage.addItem(
                            new Furniture(fName, fPrice, fQty));
                    break;

                case 3:
                    System.out.print("Enter Grocery Name: ");
                    String gName = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double gPrice = sc.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int gQty = sc.nextInt();

                    groceriesStorage.addItem(
                            new Groceries(gName, gPrice, gQty));
                    break;

                case 4:
                    System.out.println("\n--- Electronics ---");
                    display.showItem(electronicsStorage.getItemList());

                    System.out.println("\n--- Furniture ---");
                    display.showItem(furnitureStorage.getItemList());

                    System.out.println("\n--- Groceries ---");
                    display.showItem(groceriesStorage.getItemList());
                    break;

                case 5:
                    System.out.println("Exiting application...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
