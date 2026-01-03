package com.encapsulation.ecommerceplatform;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Main application class.
 * Demonstrates polymorphism using Product reference.
 */
public class ECommerceApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

        while (true) {
            System.out.println("\n===== E-Commerce Platform =====");
            System.out.println("1. Add Electronics");
            System.out.println("2. Add Clothing");
            System.out.println("3. Add Groceries");
            System.out.println("4. Display Final Prices");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    Electronics e = new Electronics();
                    addProductDetails(sc, e);
                    products.add(e);
                    System.out.println("Electronics product added!");
                    break;

                case 2:
                    Clothing c = new Clothing();
                    addProductDetails(sc, c);
                    products.add(c);
                    System.out.println("Clothing product added!");
                    break;

                case 3:
                    Groceries g = new Groceries();
                    addProductDetails(sc, g);
                    products.add(g);
                    System.out.println("Grocery product added!");
                    break;

                case 4:
                    if (products.isEmpty()) {
                        System.out.println("No products available.");
                    } else {
                        for (Product p : products) {
                            System.out.println("\n-------------------");
                            p.displayProduct();
                            if (p instanceof Taxable) {
                                System.out.println(((Taxable) p).getTaxDetails());
                            }
                            System.out.println("Final Price: " + p.calculateFinalPrice());
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting E-Commerce Platform...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // Helper method for product input
    private static void addProductDetails(Scanner sc, Product p) {
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        p.setProductDetails(id, name, price);
    }
}
