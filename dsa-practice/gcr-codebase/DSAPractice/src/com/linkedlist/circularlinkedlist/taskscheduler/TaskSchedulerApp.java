package com.linkedlist.circularlinkedlist.taskscheduler;

import java.util.Scanner;

// Main class to test task scheduler using switch-case
public class TaskSchedulerApp {

    public static void main(String[] args) {

        TaskScheduler scheduler = new TaskScheduler();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- Task Scheduler Menu ---");
            System.out.println("1. Add Task at End");
            System.out.println("2. Add Task at Beginning");
            System.out.println("3. Display Tasks");
            System.out.println("4. View Next Task");
            System.out.println("5. Search Task by Priority");
            System.out.println("6. Remove Task");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Task ID: ");
                    int idEnd = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Task Name: ");
                    String nameEnd = sc.nextLine();

                    System.out.print("Enter Priority: ");
                    String priorityEnd = sc.nextLine();

                    System.out.print("Enter Deadline: ");
                    String deadlineEnd = sc.nextLine();

                    scheduler.addAtEnd(idEnd, nameEnd, priorityEnd, deadlineEnd);
                    break;

                case 2:
                    System.out.print("Enter Task ID: ");
                    int idBeg = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Task Name: ");
                    String nameBeg = sc.nextLine();

                    System.out.print("Enter Priority: ");
                    String priorityBeg = sc.nextLine();

                    System.out.print("Enter Deadline: ");
                    String deadlineBeg = sc.nextLine();

                    scheduler.addAtBeginning(idBeg, nameBeg, priorityBeg, deadlineBeg);
                    break;

                case 3:
                    scheduler.displayTasks();
                    break;

                case 4:
                    scheduler.viewNextTask();
                    break;

                case 5:
                    System.out.print("Enter Priority to Search: ");
                    String searchPriority = sc.nextLine();
                    scheduler.searchByPriority(searchPriority);
                    break;

                case 6:
                    System.out.print("Enter Task ID to Remove: ");
                    int removeId = sc.nextInt();
                    scheduler.removeTask(removeId);
                    break;

                case 0:
                    System.out.println("Exiting Task Scheduler...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}
