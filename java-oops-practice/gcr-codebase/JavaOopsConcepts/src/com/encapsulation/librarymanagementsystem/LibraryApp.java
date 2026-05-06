package com.encapsulation.librarymanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Main application class for Library Management System.
 * Demonstrates polymorphism using LibraryItem reference.
 */
public class LibraryApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<LibraryItem> items = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Add Magazine");
            System.out.println("3. Add DVD");
            System.out.println("4. Reserve Item");
            System.out.println("5. Display All Items");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    Book book = new Book();
                    addItem(sc, book);
                    items.add(book);
                    System.out.println("Book added!");
                    break;

                case 2:
                    Magazine mag = new Magazine();
                    addItem(sc, mag);
                    items.add(mag);
                    System.out.println("Magazine added!");
                    break;

                case 3:
                    DVD dvd = new DVD();
                    addItem(sc, dvd);
                    items.add(dvd);
                    System.out.println("DVD added!");
                    break;

                case 4:
                    if (items.isEmpty()) {
                        System.out.println("No items available.");
                        break;
                    }

                    System.out.print("Enter borrower name: ");
                    String borrower = sc.nextLine();

                    for (LibraryItem item : items) {
                        if (((Reservable) item).checkAvailability()) {
                            ((Reservable) item).reserveItem(borrower);
                            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
                            break;
                        }
                    }
                    break;

                case 5:
                    for (LibraryItem item : items) {
                        System.out.println("\n---------------------");
                        item.getItemDetails();
                        System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
                    }
                    break;

                case 6:
                    System.out.println("Exiting Library Management System...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // Helper method
    private static void addItem(Scanner sc, LibraryItem item) {
        System.out.print("Enter Item ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author: ");
        String author = sc.nextLine();

        item.setItemDetails(id, title, author);
    }
}
