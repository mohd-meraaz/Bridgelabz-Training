package com.bridgelabz.bookbazaar;
import java.util.HashMap;
import java.util.Map;

public class Order {

    private String userName;
    private Map<Book, Integer> items = new HashMap<>();
    private String orderStatus = "CREATED";

    public Order(String userName) {
        this.userName = userName;
    }

    public void addBook(Book book, int quantity) {
        if (book.isAvailable(quantity)) {
            items.put(book, quantity);
            book.updateStock(quantity);
        } else {
            System.out.println("Insufficient stock for " + book.title);
        }
    }

    // Total cost calculation using operators
    public double calculateTotal() {
        double total = 0;

        for (Map.Entry<Book, Integer> entry : items.entrySet()) {
            Book book = entry.getKey();
            int quantity = entry.getValue();

            double discountedPrice = book.applyDiscount(book.price);
            total += (discountedPrice * quantity);
        }
        return total;
    }

    protected void updateOrderStatus(String status) {
        this.orderStatus = status;
    }

    public String getOrderStatus() {
        return orderStatus;
    }
}
