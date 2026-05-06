package com.encapsulation.onlinefooddelivery;

/*
 * Non-veg food item with extra charge and discount.
 */
public class NonVegItem extends FoodItem implements Discountable {

    @Override
    public double calculateTotalPrice() {
        double base = getPrice() * getQuantity();
        double extraCharge = base * 0.15; // 15% non-veg charge
        return base + extraCharge - applyDiscount();
    }

    @Override
    public double applyDiscount() {
        return getPrice() * getQuantity() * 0.05; // 5% discount
    }

    @Override
    public String getDiscountDetails() {
        return "5% discount + 15% extra charge on Non-Veg items";
    }
}
