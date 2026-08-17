package com.day12.practiceset.pizzaorderbuilder;

public class Pizza {

    private String size;
    private String crustType;
    private int toppingsCount;
    private double price;

    // 1. Only size
    Pizza(String size) {
        this(size, "Regular", 0);
    }

    // 2. Size + crust
    Pizza(String size, String crustType) {
        this(size, crustType, 0);
    }

    // 3. Size + crust + toppings
    Pizza(String size, String crustType, int toppingsCount) {
        this(size, crustType, toppingsCount, 0);
    }

    // 4.Main constructor
    Pizza(String size, String crustType, int toppingsCount, double price) {
        this.size = size;
        this.crustType = crustType;
        this.toppingsCount = toppingsCount;

        if (price > 0) {
            this.price = price;
        } else {
            this.price = calculatePrice();
        }
    }

    private double calculatePrice() {
        double basePrice;

        switch (size.toLowerCase()) {
            case "small":
                basePrice = 200;
                break;

            case "medium":
                basePrice = 300;
                break;

            case "large":
                basePrice = 400;
                break;

            default:
                throw new IllegalArgumentException("Invalid pizza size");
        }

        return basePrice + (toppingsCount * 50);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", crustType='" + crustType + '\'' +
                ", toppingsCount=" + toppingsCount +
                ", price=" + price +
                '}';
    }
}