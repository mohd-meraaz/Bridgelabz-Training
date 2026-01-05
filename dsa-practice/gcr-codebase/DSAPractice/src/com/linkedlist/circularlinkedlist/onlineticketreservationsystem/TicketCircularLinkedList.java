package com.linkedlist.circularlinkedlist.onlineticketreservationsystem;

public class TicketCircularLinkedList {

    private TicketNode head = null;
    private TicketNode tail = null;

    // Add ticket at end
    public void addTicket(int id, String customer, String movie,
                          String seat, String time) {

        TicketNode newNode = new TicketNode(id, customer, movie, seat, time);

        if (head == null) {
            head = tail = newNode;
            tail.next = head; // circular link
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }

        System.out.println("Ticket booked successfully.");
    }

    // Remove ticket by ID
    public void removeTicket(int ticketId) {

        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        TicketNode current = head;
        TicketNode prev = tail;

        do {
            if (current.ticketId == ticketId) {

                // only one node
                if (current == head && current == tail) {
                    head = tail = null;
                }
                // removing head
                else if (current == head) {
                    head = head.next;
                    tail.next = head;
                }
                // removing tail
                else if (current == tail) {
                    tail = prev;
                    tail.next = head;
                }
                // removing middle node
                else {
                    prev.next = current.next;
                }

                System.out.println("Ticket removed successfully.");
                return;
            }

            prev = current;
            current = current.next;

        } while (current != head);

        System.out.println("Ticket ID not found.");
    }

    // Display all tickets
    public void displayTickets() {

        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        TicketNode temp = head;

        System.out.println("\n--- Booked Tickets ---");
        do {
            System.out.println(
                "ID: " + temp.ticketId +
                ", Customer: " + temp.customerName +
                ", Movie: " + temp.movieName +
                ", Seat: " + temp.seatNumber +
                ", Time: " + temp.bookingTime
            );
            temp = temp.next;
        } while (temp != head);
    }

    // Search by customer or movie name
    public void searchTicket(String keyword) {

        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        TicketNode temp = head;
        boolean found = false;

        do {
            if (temp.customerName.equalsIgnoreCase(keyword)
                || temp.movieName.equalsIgnoreCase(keyword)) {

                System.out.println(
                    "ID: " + temp.ticketId +
                    ", Customer: " + temp.customerName +
                    ", Movie: " + temp.movieName +
                    ", Seat: " + temp.seatNumber +
                    ", Time: " + temp.bookingTime
                );
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No matching ticket found.");
        }
    }

    // Count total tickets
    public int countTickets() {

        if (head == null)
            return 0;

        int count = 0;
        TicketNode temp = head;

        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }
}
