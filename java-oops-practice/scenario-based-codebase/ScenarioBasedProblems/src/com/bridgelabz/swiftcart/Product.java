package com.bridgelabz.swiftcart;

public abstract class Product {

    private String name;
    private double price;
    private String category;
    private int quantity;

    public Product(String name, double price, String category, int quantity) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public abstract double getDiscount();

    public String getName() {
        return name;
    }
}
