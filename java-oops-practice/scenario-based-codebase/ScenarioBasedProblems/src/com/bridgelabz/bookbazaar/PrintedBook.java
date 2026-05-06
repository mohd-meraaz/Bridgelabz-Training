package com.bridgelabz.bookbazaar;

public class PrintedBook extends Book {

    public PrintedBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    @Override
    public double applyDiscount(double price) {
        return price * 0.95; // 5% discount
    }
}
