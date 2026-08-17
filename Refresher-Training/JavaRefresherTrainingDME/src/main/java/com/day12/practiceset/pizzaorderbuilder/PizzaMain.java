package com.day12.practiceset.pizzaorderbuilder;

public class PizzaMain {
         static void main(String[] args) {

            Pizza pizza1 = new Pizza("Small");

            Pizza pizza2 = new Pizza("Medium", "Thin");

            Pizza pizza3 = new Pizza("Large", "Cheese Burst", 3);

            Pizza pizza4 = new Pizza("Large", "Regular", 2, 999);

            System.out.println(pizza1);
            System.out.println(pizza2);
            System.out.println(pizza3);
            System.out.println(pizza4);
        }
    }