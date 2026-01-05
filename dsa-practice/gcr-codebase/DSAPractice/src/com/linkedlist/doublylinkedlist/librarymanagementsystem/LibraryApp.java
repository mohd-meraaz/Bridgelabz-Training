package com.linkedlist.doublylinkedlist.librarymanagementsystem;

import java.util.Scanner;

// Creating Main class to test library system using switch-case
public class LibraryApp {

    public static void main(String[] args) {

        LibraryDoublyLinkedList library = new LibraryDoublyLinkedList();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- Library Management Menu ---");
            System.out.println("1. Add Book at Beginning");
            System.out.println("2. Add Book at End");
            System.out.println("3. Add Book at Position");
            System.out.println("4. Display Books (Forward)");
            System.out.println("5. Display Books (Reverse)");
            System.out.println("6. Search Book by Title");
            System.out.println("7. Update Book Availability");
            System.out.println("8. Remove Book by ID");
            System.out.println("9. Count Total Books");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Book Title: ");
                    String titleBeg = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String authorBeg = sc.nextLine();

                    System.out.print("Enter Genre: ");
                    String genreBeg = sc.nextLine();

                    System.out.print("Enter Book ID: ");
                    int idBeg = sc.nextInt();

                    System.out.print("Is Available (true/false): ");
                    boolean availBeg = sc.nextBoolean();

                    library.addAtBeginning(titleBeg, authorBeg, genreBeg, idBeg, availBeg);
                    break;

                case 2:
                    System.out.print("Enter Book Title: ");
                    String titleEnd = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String authorEnd = sc.nextLine();

                    System.out.print("Enter Genre: ");
                    String genreEnd = sc.nextLine();

                    System.out.print("Enter Book ID: ");
                    int idEnd = sc.nextInt();

                    System.out.print("Is Available (true/false): ");
                    boolean availEnd = sc.nextBoolean();

                    library.addAtEnd(titleEnd, authorEnd, genreEnd, idEnd, availEnd);
                    break;

                case 3:
                    System.out.print("Enter Position: ");
                    int position = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String titlePos = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String authorPos = sc.nextLine();

                    System.out.print("Enter Genre: ");
                    String genrePos = sc.nextLine();

                    System.out.print("Enter Book ID: ");
                    int idPos = sc.nextInt();

                    System.out.print("Is Available (true/false): ");
                    boolean availPos = sc.nextBoolean();

                    library.addAtPosition(position, titlePos, authorPos, genrePos, idPos, availPos);
                    break;

                case 4:
                    library.displayForward();
                    break;

                case 5:
                    library.displayReverse();
                    break;

                case 6:
                    System.out.print("Enter Book Title to Search: ");
                    String searchTitle = sc.nextLine();
                    library.searchBook(searchTitle);
                    break;

                case 7:
                    System.out.print("Enter Book ID: ");
                    int updateId = sc.nextInt();

                    System.out.print("Enter Availability (true/false): ");
                    boolean newStatus = sc.nextBoolean();

                    library.updateAvailability(updateId, newStatus);
                    break;

                case 8:
                    System.out.print("Enter Book ID to Remove: ");
                    int removeId = sc.nextInt();
                    library.removeByBookId(removeId);
                    break;

                case 9:
                    System.out.println("Total Books: " + library.countBooks());
                    break;

                case 0:
                    System.out.println("Exiting Library Management System...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}
