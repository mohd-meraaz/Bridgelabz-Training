package com.bridgelabz.medistore;
import java.time.LocalDate;

public abstract class Medicine implements ISellable {

    protected String name;
    protected LocalDate expiryDate;

    private double price;     // sensitive pricing
    private int quantity;     // protected stock

    // Constructor with default quantity
    public Medicine(String name, double price, LocalDate expiryDate) {
        this(name, price, expiryDate, 50);
    }

    public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    // Encapsulated stock update
    protected void updateStock(int soldUnits) {
        quantity -= soldUnits;
    }

    protected double calculateTotalPrice(int units) {
        double total = price * units;
        double discount = units >= 10 ? total * 0.10 : 0;
        return total - discount;
    }

    public int getQuantity() {
        return quantity;
    }

    // Default expiry check
    protected boolean isExpired() {
        return expiryDate.isBefore(LocalDate.now());
    }
}
