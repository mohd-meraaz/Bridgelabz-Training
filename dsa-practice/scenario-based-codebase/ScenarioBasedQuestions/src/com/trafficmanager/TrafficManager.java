package com.trafficmanager;

import java.util.*;

class TrafficManager {
    private Vehicle head = null;
    private Queue<Vehicle> waitingQueue = new LinkedList<>();
    private int capacity;
    private int currentSize = 0;

    public TrafficManager(int capacity) {
        this.capacity = capacity;
    }

    // Vehicle arrives
    public void arrive(String vehicleNumber) {
        Vehicle vehicle = new Vehicle(vehicleNumber);

        if (currentSize < capacity) {
            addToRoundabout(vehicle);
            System.out.println(vehicleNumber + " entered roundabout");
        } else {
            waitingQueue.offer(vehicle);
            System.out.println("Roundabout full. " + vehicleNumber + " waiting");
        }
    }

    // Add vehicle to circular list
    private void addToRoundabout(Vehicle vehicle) {
        if (head == null) {
            head = vehicle;
            vehicle.next = head;
        } else {
            Vehicle temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = vehicle;
            vehicle.next = head;
        }
        currentSize++;
    }

    // Vehicle exits
    public void exit(String vehicleNumber) {
        if (head == null) {
            System.out.println("Roundabout empty");
            return;
        }

        Vehicle curr = head, prev = null;

        do {
            if (curr.number.equals(vehicleNumber)) {

                // single vehicle case
                if (curr == head && curr.next == head) {
                    head = null;
                }
                // removing head
                else if (curr == head) {
                    Vehicle last = head;
                    while (last.next != head)
                        last = last.next;

                    head = head.next;
                    last.next = head;
                }
                // middle vehicle
                else {
                    prev.next = curr.next;
                }

                currentSize--;
                System.out.println(vehicleNumber + " exited roundabout");

                // allow waiting vehicle to enter
                if (!waitingQueue.isEmpty()) {
                    addToRoundabout(waitingQueue.poll());
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Vehicle not found in roundabout");
    }

    // Print roundabout state
    public void displayRoundabout() {
        if (head == null) {
            System.out.println("Roundabout is empty");
            return;
        }

        Vehicle temp = head;
        System.out.print("Roundabout: ");
        do {
            System.out.print(temp.number + " → ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(Back to " + head.number + ")");
    }

    // Print waiting queue
    public void displayQueue() {
        System.out.println("Waiting Queue: " +
            (waitingQueue.isEmpty() ? "Empty" : waitingQueue));
    }
}
