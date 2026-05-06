package com.encapsulation.onlinefooddelivery;

/*
 * Abstract base class for all food items.
 * Demonstrates encapsulation and abstraction.
 */
public abstract class FoodItem {

    private String itemName;
    private double price;
    private int quantity;

    // Encapsulation: setters with validation
    public void setItemDetails(String itemName, double price, int quantity) {
        if (price < 0 || quantity <= 0) {
            System.out.println("Invalid item details!");
            return;
        }
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters (read-only access)
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Abstract method
    public abstract double calculateTotalPrice();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}
