package com.inheritance.multilevelinheritance.onlineretail;

import java.util.Scanner;

public class OrderApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DeliveredOrder order = null;

        while (true) {
            System.out.println("\n===== Online Retail Order Management =====");
            System.out.println("1. Place Order");
            System.out.println("2. Ship Order");
            System.out.println("3. Deliver Order");
            System.out.println("4. View Order Status");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    order = new DeliveredOrder();

                    System.out.print("Enter Order ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Order Date: ");
                    String orderDate = sc.nextLine();

                    order.setOrderDetails(id, orderDate);
                    System.out.println("Order placed successfully!");
                    break;

                case 2:
                    if (order != null) {
                        System.out.print("Enter Tracking Number: ");
                        String tracking = sc.nextLine();
                        order.setShippingDetails(tracking);
                        System.out.println("Order shipped successfully!");
                    } else {
                        System.out.println("Please place an order first.");
                    }
                    break;

                case 3:
                    if (order != null) {
                        System.out.print("Enter Delivery Date: ");
                        String deliveryDate = sc.nextLine();
                        order.setDeliveryDetails(deliveryDate);
                        System.out.println("Order delivered successfully!");
                    } else {
                        System.out.println("Please place an order first.");
                    }
                    break;

                case 4:
                    if (order != null) {
                        System.out.println("\nOrder ID: " + order.orderId);
                        System.out.println("Order Date: " + order.orderDate);
                        System.out.println("Order Status: " + order.getOrderStatus());
                    } else {
                        System.out.println("No order found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting Order Management System...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
