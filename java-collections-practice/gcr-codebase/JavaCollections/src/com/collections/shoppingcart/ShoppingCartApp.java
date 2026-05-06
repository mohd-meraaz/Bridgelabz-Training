package com.collections.shoppingcart;

public class ShoppingCartApp {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addToCart("Laptop", 1);
        cart.addToCart("Mouse", 2);
        cart.addToCart("Phone", 1);
        cart.addToCart("Keyboard", 1);

        cart.displayCart();
        cart.displaySortedByPrice();

        System.out.println("\nTotal Bill: " + cart.calculateTotal());
    }
}