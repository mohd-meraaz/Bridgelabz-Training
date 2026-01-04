package com.encapsulation.onlinefooddelivery;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Main application class for Online Food Delivery System.
 * Demonstrates polymorphism using FoodItem reference.
 */
public class FoodDeliveryApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<FoodItem> order = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Online Food Delivery System =====");
            System.out.println("1. Add Veg Item");
            System.out.println("2. Add Non-Veg Item");
            System.out.println("3. View Order & Total Bill");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    VegItem veg = new VegItem();
                    addItem(sc, veg);
                    order.add(veg);
                    System.out.println("Veg item added!");
                    break;

                case 2:
                    NonVegItem nonVeg = new NonVegItem();
                    addItem(sc, nonVeg);
                    order.add(nonVeg);
                    System.out.println("Non-Veg item added!");
                    break;

                case 3:
                    if (order.isEmpty()) {
                        System.out.println("No items in the order.");
                    } else {
                        double grandTotal = 0;

                        for (FoodItem item : order) {
                            System.out.println("\n---------------------");
                            item.getItemDetails();

                            if (item instanceof Discountable) {
                                System.out.println(((Discountable) item).getDiscountDetails());
                            }

                            double total = item.calculateTotalPrice();
                            System.out.println("Item Total: " + total);
                            grandTotal += total;
                        }

                        System.out.println("\nGrand Total Bill: " + grandTotal);
                    }
                    break;

                case 4:
                    System.out.println("Exiting Online Food Delivery System...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // Helper method for taking item input
    private static void addItem(Scanner sc, FoodItem item) {
        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();
        sc.nextLine();

        item.setItemDetails(name, price, qty);
    }
}
