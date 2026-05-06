package com.smartcheckout;

import java.util.*;

class SmartCheckout {
    private Queue<Customer> queue = new LinkedList<>();
    private Map<String, Item> inventory = new HashMap<>();

    // Add item to inventory
    public void addItem(String name, double price, int stock) {
        inventory.put(name, new Item(name, price, stock));
    }

    // Customer enters queue
    public void addCustomer(Customer customer) {
        queue.offer(customer);
        System.out.println(customer.name + " joined the queue");
    }

    // Remove customer (after billing)
    public void processCheckout() {
        if (queue.isEmpty()) {
            System.out.println("No customers in queue");
            return;
        }

        Customer customer = queue.poll();
        double total = 0;

        System.out.println("\nBilling customer: " + customer.name);

        for (String itemName : customer.cart) {
            Item item = inventory.get(itemName);

            if (item != null && item.stock > 0) {
                total += item.price;
                item.stock--;
                System.out.println(itemName + " - ₹" + item.price);
            } else {
                System.out.println(itemName + " - Out of stock");
            }
        }

        System.out.println("Total bill: ₹" + total);
    }

    // Display inventory
    public void displayInventory() {
        System.out.println("\nCurrent Inventory:");
        for (Item item : inventory.values()) {
            System.out.println(
                item.name + " | Price: ₹" + item.price +
                " | Stock: " + item.stock
            );
        }
    }
}
