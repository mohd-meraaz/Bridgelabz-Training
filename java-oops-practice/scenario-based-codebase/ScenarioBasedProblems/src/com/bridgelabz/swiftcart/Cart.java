package com.bridgelabz.swiftcart;

import java.util.ArrayList;

public class Cart implements ICheckout {

    private ArrayList<Product> products;
    private double totalPrice;

    // Empty cart
    public Cart() {
        products = new ArrayList<>();
    }

    // Cart with pre-selected items
    public Cart(ArrayList<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    private void calculateTotal() {
        totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.getTotalPrice();
        }
    }

    @Override
    public void applyDiscount() {
        for (Product p : products) {
            totalPrice -= p.getDiscount();
        }
    }

    @Override
    public void generateBill() {
        calculateTotal();
        applyDiscount();

        System.out.println("----- SwiftCart Bill -----");
        for (Product p : products) {
            System.out.println("Item: " + p.getName());
        }
        System.out.println("Final Amount: ₹" + totalPrice);
    }
}
