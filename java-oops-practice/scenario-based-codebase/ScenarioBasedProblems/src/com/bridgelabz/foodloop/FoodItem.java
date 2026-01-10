package com.bridgelabz.foodloop;

public abstract class FoodItem {

    protected String name;
    protected String category;
    protected double price;

    private int stock;          // hidden availability

    public FoodItem(String name, String category, double price, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    public boolean isAvailable() {
        return stock > 0;
    }

    protected void reduceStock() {
        stock--;
    }

    public abstract double applyDiscount(double total);
}
