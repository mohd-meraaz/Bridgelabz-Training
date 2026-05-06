package com.smartcheckout;

public class Main {
    public static void main(String[] args) {
        SmartCheckout checkout = new SmartCheckout();

        checkout.addItem("Milk", 50, 10);
        checkout.addItem("Bread", 40, 5);
        checkout.addItem("Eggs", 6, 30);

        Customer c1 = new Customer("Amit");
        c1.addItem("Milk");
        c1.addItem("Bread");

        Customer c2 = new Customer("Neha");
        c2.addItem("Milk");
        c2.addItem("Eggs");
        c2.addItem("Eggs");

        checkout.addCustomer(c1);
        checkout.addCustomer(c2);

        checkout.processCheckout();
        checkout.processCheckout();

        checkout.displayInventory();
    }
}
