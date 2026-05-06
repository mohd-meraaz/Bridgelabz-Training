package com.encapsulation.ecommerceplatform;

/*
 * Grocery products with discount but no tax.
 */
public class Groceries extends Product {

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}
