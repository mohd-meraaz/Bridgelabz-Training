package com.bridgelabz.swiftcart;

public class NonPerishableProduct extends Product {

    public NonPerishableProduct(String name, double price, String category, int quantity) {
        super(name, price, category, quantity);
    }

    @Override
    public double getDiscount() {
        return getTotalPrice() * 0.05; // 5% discount
    }
}
