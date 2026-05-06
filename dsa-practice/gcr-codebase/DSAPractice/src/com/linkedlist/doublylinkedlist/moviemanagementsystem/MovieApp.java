package com.linkedlist.doublylinkedlist.moviemanagementsystem;

import java.util.Scanner;

// Main class to test Movie Management System
public class MovieApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MovieDoublyLinkedList movies = new MovieDoublyLinkedList();

        while (true) {
            System.out.println("\n===== Movie Management System =====");
            System.out.println("1. Add Movie at Beginning");
            System.out.println("2. Add Movie at End");
            System.out.println("3. Add Movie at Position");
            System.out.println("4. Display Movies (Forward)");
            System.out.println("5. Display Movies (Reverse)");
            System.out.println("6. Search Movie");
            System.out.println("7. Update Movie Rating");
            System.out.println("8. Remove Movie by Title");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    addMovie(sc, movies, "beginning");
                    break;

                case 2:
                    addMovie(sc, movies, "end");
                    break;

                case 3:
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter movie title: ");
                    String t = sc.nextLine();
                    System.out.print("Enter director: ");
                    String d = sc.nextLine();
                    System.out.print("Enter release year: ");
                    int y = sc.nextInt();
                    System.out.print("Enter rating: ");
                    double r = sc.nextDouble();

                    movies.addAtPosition(pos, t, d, y, r);
                    System.out.println("Movie added at position " + pos);
                    break;

                case 4:
                    System.out.println("\nForward Display:");
                    movies.displayForward();
                    break;

                case 5:
                    System.out.println("\nReverse Display:");
                    movies.displayReverse();
                    break;

                case 6:
                    System.out.print("Enter director name to search: ");
                    String director = sc.nextLine();
                    System.out.print("Enter release year (0 to skip): ");
                    int year = sc.nextInt();
                    sc.nextLine();

                    movies.searchMovie(director, year);
                    break;

                case 7:
                    System.out.print("Enter movie title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter new rating: ");
                    double newRating = sc.nextDouble();

                    movies.updateRating(title, newRating);
                    break;

                case 8:
                    System.out.print("Enter movie title to remove: ");
                    String removeTitle = sc.nextLine();

                    movies.removeByTitle(removeTitle);
                    break;

                case 9:
                    System.out.println("Exiting Movie Management System...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // Helper method to add movie
    private static void addMovie(Scanner sc, MovieDoublyLinkedList movies, String type) {

        System.out.print("Enter movie title: ");
        String title = sc.nextLine();
        System.out.print("Enter director: ");
        String director = sc.nextLine();
        System.out.print("Enter release year: ");
        int year = sc.nextInt();
        System.out.print("Enter rating: ");
        double rating = sc.nextDouble();
        sc.nextLine();

        if (type.equals("beginning")) {
            movies.addAtBeginning(title, director, year, rating);
        } else {
            movies.addAtEnd(title, director, year, rating);
        }

        System.out.println("Movie added successfully!");
    }
}
