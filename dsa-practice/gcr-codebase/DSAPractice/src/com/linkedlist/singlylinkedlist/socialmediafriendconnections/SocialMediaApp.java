package com.linkedlist.singlylinkedlist.socialmediafriendconnections;

import java.util.Scanner;

// Creating main class to test social media system using switch-case
public class SocialMediaApp {

    public static void main(String[] args) {

        SocialMediaLinkedList sm = new SocialMediaLinkedList();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- Social Media Friend Connection Menu ---");
            System.out.println("1. Add User");
            System.out.println("2. Add Friend");
            System.out.println("3. Display Friends");
            System.out.println("4. Find Mutual Friends");
            System.out.println("5. Search User");
            System.out.println("6. Count Friends");
            System.out.println("7. Remove Friend");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter User ID: ");
                    int userId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter User Name: ");
                    String userName = sc.nextLine();

                    System.out.print("Enter User Age: ");
                    int age = sc.nextInt();

                    sm.addUser(userId, userName, age);
                    break;

                case 2:
                    System.out.print("Enter User ID: ");
                    int u1 = sc.nextInt();

                    System.out.print("Enter Friend ID: ");
                    int u2 = sc.nextInt();

                    sm.addFriend(u1, u2);
                    break;

                case 3:
                    System.out.print("Enter User ID: ");
                    int displayId = sc.nextInt();
                    sm.displayFriends(displayId);
                    break;

                case 4:
                    System.out.print("Enter First User ID: ");
                    int f1 = sc.nextInt();

                    System.out.print("Enter Second User ID: ");
                    int f2 = sc.nextInt();

                    sm.findMutualFriends(f1, f2);
                    break;

                case 5:
                    System.out.print("Enter User Name to Search: ");
                    String searchName = sc.nextLine();
                    sm.searchUser(searchName);
                    break;

                case 6:
                    sm.countFriends();
                    break;

                case 7:
                    System.out.print("Enter User ID: ");
                    int r1 = sc.nextInt();

                    System.out.print("Enter Friend ID to Remove: ");
                    int r2 = sc.nextInt();

                    sm.removeFriend(r1, r2);
                    break;

                case 0:
                    System.out.println("Exiting Social Media System...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}
