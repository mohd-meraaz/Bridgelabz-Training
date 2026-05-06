package com.collections.shoppingcart;

import java.util.*;

class ShoppingCart {
    private Map<String, Double> productPriceMap = new HashMap<>();
    private Map<String, Integer> cart = new LinkedHashMap<>();

    public ShoppingCart() {
        productPriceMap.put("Laptop", 60000.0);
        productPriceMap.put("Phone", 30000.0);
        productPriceMap.put("Headphones", 2000.0);
        productPriceMap.put("Keyboard", 1500.0);
        productPriceMap.put("Mouse", 800.0);
    }

    public void addToCart(String product, int quantity) {
        if (!productPriceMap.containsKey(product)) {
            System.out.println("Product not available: " + product);
            return;
        }
        cart.put(product, cart.getOrDefault(product, 0) + quantity);
        System.out.println("Added " + product + " (Qty: " + quantity + ")");
    }

  
    public void displayCart() {
        System.out.println("\nCart Items (Insertion Order):");
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            String product = entry.getKey();
            int qty = entry.getValue();
            double price = productPriceMap.get(product);
            System.out.println(product + " | Qty: " + qty + " | Price: " + price);
        }
    }

  
    public void displaySortedByPrice() {
        System.out.println("\nCart Items Sorted by Price:");

    
        TreeMap<Double, String> sortedMap = new TreeMap<>();

        for (String product : cart.keySet()) {
            sortedMap.put(productPriceMap.get(product), product);
        }

        for (Map.Entry<Double, String> entry : sortedMap.entrySet()) {
            String product = entry.getValue();
            double price = entry.getKey();
            int qty = cart.get(product);
            System.out.println(product + " | Qty: " + qty + " | Price: " + price);
        }
    }

   
    public double calculateTotal() {
        double total = 0;
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            total += productPriceMap.get(entry.getKey()) * entry.getValue();
        }
        return total;
    }
}