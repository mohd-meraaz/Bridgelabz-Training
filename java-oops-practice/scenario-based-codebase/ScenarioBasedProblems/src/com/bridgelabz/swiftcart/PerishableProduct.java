package com.bridgelabz.swiftcart;

public class PerishableProduct extends Product {

    public PerishableProduct(String name, double price, String category, int quantity) {
        super(name, price, category, quantity);
    }

    @Override
    public double getDiscount() {
        return getTotalPrice() * 0.20; // 20% discount
    }
}
