package com.encapsulation.ecommerceplatform;

/*
 * Clothing product with tax and discount.
 */
public class Clothing extends Product implements Taxable {

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20; // 20% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.12; // 12% GST
    }

    @Override
    public String getTaxDetails() {
        return "12% GST applied on Clothing";
    }
}
