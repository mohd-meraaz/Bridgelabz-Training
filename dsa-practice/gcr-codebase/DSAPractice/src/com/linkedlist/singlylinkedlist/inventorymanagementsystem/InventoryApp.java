package com.linkedlist.singlylinkedlist.inventorymanagementsystem;

import java.util.Scanner;

// Main class to test inventory system using switch-case
public class InventoryApp {

    public static void main(String[] args) {

        InventoryLinkedList inventory = new InventoryLinkedList();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- Inventory Management Menu ---");
            System.out.println("1. Add Item at End");
            System.out.println("2. Add Item at Beginning");
            System.out.println("3. Display Inventory");
            System.out.println("4. Update Item Quantity");
            System.out.println("5. Search Item by ID");
            System.out.println("6. Remove Item by ID");
            System.out.println("7. Calculate Total Inventory Value");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Item ID: ");
                    int idEnd = sc.nextInt();

                    System.out.print("Enter Item Name: ");
                    sc.nextLine();
                    String nameEnd = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int qtyEnd = sc.nextInt();

                    System.out.print("Enter Price: ");
                    double priceEnd = sc.nextDouble();

                    inventory.addAtEnd(idEnd, nameEnd, qtyEnd, priceEnd);
                    break;

                case 2:
                    System.out.print("Enter Item ID: ");
                    int idBeg = sc.nextInt();

                    System.out.print("Enter Item Name: ");
                    sc.nextLine();
                    String nameBeg = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int qtyBeg = sc.nextInt();

                    System.out.print("Enter Price: ");
                    double priceBeg = sc.nextDouble();

                    inventory.addAtBeginning(idBeg, nameBeg, qtyBeg, priceBeg);
                    break;

                case 3:
                    inventory.displayInventory();
                    break;

                case 4:
                    System.out.print("Enter Item ID: ");
                    int updateId = sc.nextInt();

                    System.out.print("Enter New Quantity: ");
                    int newQty = sc.nextInt();

                    inventory.updateQuantity(updateId, newQty);
                    break;

                case 5:
                    System.out.print("Enter Item ID to Search: ");
                    int searchId = sc.nextInt();

                    inventory.searchById(searchId);
                    break;

                case 6:
                    System.out.print("Enter Item ID to Remove: ");
                    int removeId = sc.nextInt();

                    inventory.removeById(removeId);
                    break;

                case 7:
                    inventory.calculateTotalValue();
                    break;

                case 0:
                    System.out.println("Exiting Inventory Management System...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}
