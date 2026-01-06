package com.bridgelabz.swiftcart;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();
        int choice;

        do {
            System.out.println("\n=== SwiftCart Menu ===");
            System.out.println("1. Add Perishable Product");
            System.out.println("2. Add Non-Perishable Product");
            System.out.println("3. Generate Bill & Checkout");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter product name: ");
                    String pName = sc.nextLine();

                    System.out.print("Enter price: ");
                    double pPrice = sc.nextDouble();

                    System.out.print("Enter quantity: ");
                    int pQty = sc.nextInt();
                    sc.nextLine();

                    cart.addProduct(
                        new PerishableProduct(pName, pPrice, "Perishable", pQty)
                    );

                    System.out.println("Perishable product added.");
                    break;

                case 2:
                    System.out.print("Enter product name: ");
                    String npName = sc.nextLine();

                    System.out.print("Enter price: ");
                    double npPrice = sc.nextDouble();

                    System.out.print("Enter quantity: ");
                    int npQty = sc.nextInt();
                    sc.nextLine();

                    cart.addProduct(
                        new NonPerishableProduct(npName, npPrice, "Non-Perishable", npQty)
                    );

                    System.out.println("Non-perishable product added.");
                    break;

                case 3:
                    cart.generateBill();
                    break;

                case 0:
                    System.out.println("Thank you for using SwiftCart!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}
