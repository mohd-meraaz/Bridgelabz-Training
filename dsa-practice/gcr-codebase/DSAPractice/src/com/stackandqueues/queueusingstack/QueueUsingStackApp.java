package com.stackandqueues.queueusingstack;

import java.util.Scanner;

// Main class to test Queue Using Stack
public class QueueUsingStackApp {

    public static void main(String[] args) {

        QueueUsingStack queue = new QueueUsingStack();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- Queue Using Stack Menu ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Is Empty");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();
                    queue.enqueue(value);
                    break;

                case 2:
                    int removed = queue.dequeue();
                    if (removed != -1) {
                        System.out.println("Dequeued element: " + removed);
                    }
                    break;

                case 3:
                    int front = queue.peek();
                    if (front != -1) {
                        System.out.println("Front element: " + front);
                    }
                    break;

                case 4:
                    System.out.println("Queue Empty? " + queue.isEmpty());
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}
