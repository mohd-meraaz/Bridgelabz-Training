package com.bridgelabz.bookbazaar;

public abstract class Book implements IDiscountable {

    protected String title;
    protected String author;
    protected double price;

    private int stock;   // inventory protected

    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    // Optional offer constructor
    public Book(String title, String author, double price) {
        this(title, author, price, 10);
    }

    public boolean isAvailable(int quantity) {
        return stock >= quantity;
    }

    protected void updateStock(int quantity) {
        this.stock -= quantity;
    }

    public int getStock() {
        return stock;
    }

    public abstract double applyDiscount(double price);
}
