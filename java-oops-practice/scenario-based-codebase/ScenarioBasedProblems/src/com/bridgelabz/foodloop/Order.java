package com.bridgelabz.foodloop;

import java.util.ArrayList;
import java.util.List;

public class Order implements IOrderable {

    private List<FoodItem> items = new ArrayList<>();
    private double total;
    private boolean isPlaced;

    // Constructor for combo meals
    public Order(List<FoodItem> comboItems) {
        this.items.addAll(comboItems);
    }

    public void addItem(FoodItem item) {
        if (item.isAvailable()) {
            items.add(item);
            item.reduceStock();
        }
    }

    private void calculateTotal() {
        total = 0;
        for (FoodItem item : items) {
            total += item.price;
        }

        // discount application
        for (FoodItem item : items) {
            total -= item.applyDiscount(total);
            break; // apply discount once per order
        }
    }

    @Override
    public void placeOrder() {
        calculateTotal();
        isPlaced = true;
        System.out.println("Order placed successfully ✅");
        System.out.println("Total Bill: ₹" + total);
    }

    @Override
    public void cancelOrder() {
        isPlaced = false;
        System.out.println("Order cancelled ❌");
    }
}
