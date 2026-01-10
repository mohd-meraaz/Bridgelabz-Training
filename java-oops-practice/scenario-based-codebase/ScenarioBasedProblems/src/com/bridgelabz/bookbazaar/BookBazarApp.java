package com.bridgelabz.bookbazaar;

public class BookBazarApp {
    public static void main(String[] args) {

        Book ebook = new EBook("Java Basics", "Karan Nagesh", 500, 20);
        Book pbook = new PrintedBook("OOP Concepts", "Lucky Pal", 800, 10);

        Order order = new Order("Vishal");

        order.addBook(ebook, 2);
        order.addBook(pbook, 1);

        System.out.println("Total Order Cost: " + order.calculateTotal());
        System.out.println("Order Status: " + order.getOrderStatus());
    }
}
