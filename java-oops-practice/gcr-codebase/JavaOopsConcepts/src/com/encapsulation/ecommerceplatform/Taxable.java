package com.encapsulation.ecommerceplatform;

/*
 * Interface for taxable products.
 */
public interface Taxable {

    double calculateTax();

    String getTaxDetails();
}
