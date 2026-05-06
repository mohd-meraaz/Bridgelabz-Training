package com.linkedlist.circularlinkedlist.onlineticketreservationsystem;

import java.util.Scanner;

// Main application class
public class TicketReservationApp {

    public static void main(String[] args) {

        TicketCircularLinkedList system = new TicketCircularLinkedList();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- Online Ticket Reservation Menu ---");
            System.out.println("1. Book Ticket");
            System.out.println("2. Remove Ticket");
            System.out.println("3. Display All Tickets");
            System.out.println("4. Search Ticket");
            System.out.println("5. Count Total Tickets");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Ticket ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Customer Name: ");
                    String customer = sc.nextLine();

                    System.out.print("Movie Name: ");
                    String movie = sc.nextLine();

                    System.out.print("Seat Number: ");
                    String seat = sc.nextLine();

                    System.out.print("Booking Time: ");
                    String time = sc.nextLine();

                    system.addTicket(id, customer, movie, seat, time);
                    break;

                case 2:
                    System.out.print("Enter Ticket ID to remove: ");
                    int removeId = sc.nextInt();
                    system.removeTicket(removeId);
                    break;

                case 3:
                    system.displayTickets();
                    break;

                case 4:
                    System.out.print("Enter Customer or Movie Name: ");
                    String key = sc.nextLine();
                    system.searchTicket(key);
                    break;

                case 5:
                    System.out.println("Total Tickets Booked: "
                            + system.countTickets());
                    break;

                case 0:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}
