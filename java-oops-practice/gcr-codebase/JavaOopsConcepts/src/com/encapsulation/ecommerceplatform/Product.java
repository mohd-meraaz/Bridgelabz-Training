package com.encapsulation.ecommerceplatform;

/*
 * Abstract base class for all products.
 * Demonstrates encapsulation and abstraction.
 */
public abstract class Product {

    private int productId;
    private String name;
    private double price;

    // Encapsulation with setters
    public void setProductDetails(int productId, String name, double price) {
        if (productId <= 0 || price < 0) {
            System.out.println("Invalid product details!");
            return;
        }
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getters
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Abstract method for discount
    public abstract double calculateDiscount();

    // Final price calculation (polymorphism support)
    public double calculateFinalPrice() {
        double tax = (this instanceof Taxable)
                ? ((Taxable) this).calculateTax()
                : 0;
        return price + tax - calculateDiscount();
    }

    public void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Base Price: " + price);
    }
}
