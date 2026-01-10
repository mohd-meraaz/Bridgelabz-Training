package com.bridgelabz.foodloop;

public class VegItem extends FoodItem {

    public VegItem(String name, double price, int stock) {
        super(name, "Veg", price, stock);
    }

    @Override
    public double applyDiscount(double total) {
        return total >= 500 ? total * 0.10 : 0; // 10% discount
    }
}
