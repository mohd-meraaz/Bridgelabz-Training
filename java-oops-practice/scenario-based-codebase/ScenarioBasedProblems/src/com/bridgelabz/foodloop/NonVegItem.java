package com.bridgelabz.foodloop;

public class NonVegItem extends FoodItem {

    public NonVegItem(String name, double price, int stock) {
        super(name, "Non-Veg", price, stock);
    }

    @Override
    public double applyDiscount(double total) {
        return total >= 700 ? total * 0.05 : 0; // 5% discount
    }
}
