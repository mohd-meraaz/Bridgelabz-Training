package com.inheritance.singleinheritance.library;

import java.util.Scanner;

/*
 * Main class of the Library application.
 * Uses an infinite loop to allow repeated operations.
 */
public class LibraryApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Author author = new Author(); // child class object

        while (true) {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Enter Book and Author Details");
            System.out.println("2. Display Details");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear input buffer

            switch (choice) {

                case 1:
                    // Taking book details
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Publication Year: ");
                    int year = sc.nextInt();
                    sc.nextLine(); // clear buffer

                    // Taking author details
                    System.out.print("Enter Author Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Author Bio: ");
                    String bio = sc.nextLine();

                    // Setting details
                    author.setBookDetails(title, year);
                    author.setAuthorDetails(name, bio);

                    System.out.println("Details saved successfully!");
                    break;

                case 2:
                    // Displaying details
                    System.out.println("\n--- Book and Author Information ---");
                    author.displayInfo();
                    break;

                case 3:
                    // Exiting the application
                    System.out.println("Exiting Library Management System...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
