package com.encapsulation.ecommerceplatform;

/*
 * Electronics product with tax and discount.
 */
public class Electronics extends Product implements Taxable {

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% GST
    }

    @Override
    public String getTaxDetails() {
        return "18% GST applied on Electronics";
    }
}
