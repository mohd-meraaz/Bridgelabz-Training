package com.bridgelabz.hospitalmanagementsystem;


public class Bill implements Payable {

    private double baseAmount;
    private double taxRate;
    private double discount;

    public Bill(double baseAmount, double taxRate, double discount) {
        if (baseAmount < 0 || taxRate < 0 || discount < 0) {
            throw new IllegalArgumentException("Invalid billing values");
        }
        this.baseAmount = baseAmount;
        this.taxRate = taxRate;
        this.discount = discount;
    }

    @Override
    public double calculatePayment() {
        double tax = baseAmount * taxRate;
        double total = baseAmount + tax - discount;

        // Edge case: no negative bills
        return Math.max(total, 0);
    }
}
