package com.encapsulation.onlinefooddelivery;

/*
 * Interface for items that support discounts.
 */
public interface Discountable {

    double applyDiscount();

    String getDiscountDetails();
}
