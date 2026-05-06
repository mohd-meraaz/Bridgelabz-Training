package com.encapsulation.onlinefooddelivery;

/*
 * Veg food item with discount.
 */
public class VegItem extends FoodItem implements Discountable {

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) - applyDiscount();
    }

    @Override
    public double applyDiscount() {
        return getPrice() * getQuantity() * 0.10; // 10% discount
    }

    @Override
    public String getDiscountDetails() {
        return "10% discount on Veg items";
    }
}
