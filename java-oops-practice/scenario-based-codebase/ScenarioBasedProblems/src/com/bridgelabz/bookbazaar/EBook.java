package com.bridgelabz.bookbazaar;

public class EBook extends Book {

    public EBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    @Override
    public double applyDiscount(double price) {
        return price * 0.90; // 10% discount
    }
}
