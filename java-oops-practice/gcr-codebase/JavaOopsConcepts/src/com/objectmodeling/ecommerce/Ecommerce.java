package com.objectmodeling.ecommerce;

public class Ecommerce {
	public static void main(String[] args) {
	 // Create Products
    Product p1 = new Product(101, "Laptop", 80000.00);
    Product p2 = new Product(102, "Mouse", 3500.00);
    Product p3 = new Product(103, "Keyboard", 5500.00);

    // Create Customer
    Customer customer1 = new Customer(1, "Rohit");
    Customer customer2 = new Customer(2, "Rohan");
    Customer customer3 = new Customer(3, "Rahul");

    // Create Order
    Order order1 = new Order(1001);
    order1.addProduct(p1);
    order1.addProduct(p2);
    
    
    Order order2 = new Order(1002);
    order2.addProduct(p1);
    order2.addProduct(p3);
    
    Order order3 = new Order(1003);
    order3.addProduct(p2);
    order3.addProduct(p3);
    
    
    // Customer places order
    customer1.placeOrder(order1);
    customer2.placeOrder(order2);
    customer3.placeOrder(order3);

    // View customer orders
    customer1.viewOrders();
    customer2.viewOrders();
    customer3.viewOrders();
	}

}