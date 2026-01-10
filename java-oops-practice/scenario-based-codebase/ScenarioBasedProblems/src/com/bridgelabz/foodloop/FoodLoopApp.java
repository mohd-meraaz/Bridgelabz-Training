package com.bridgelabz.foodloop;

import java.util.Arrays;

public class FoodLoopApp {
    public static void main(String[] args) {

        FoodItem item1 = new VegItem("Paneer Burger", 250, 10);
        FoodItem item2 = new NonVegItem("Chicken Pizza", 450, 5);

        Order order = new Order(Arrays.asList(item1, item2));

        order.placeOrder();
    }
}
