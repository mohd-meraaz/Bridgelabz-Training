package com.bridgelabz.payxpress;

import java.time.LocalDate;

abstract class Bill implements IPayable {
    protected String type;
    protected double amount;
    protected LocalDate dueDate;
    private boolean isPaid;          
    protected double penalty = 50;  

    // Constructor 
    public Bill(String type, double amount, LocalDate dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    // Operator usage: baseAmount + penalty
    public double calculateLateFee() {
        return amount + penalty;
    }

    protected void markPaid() {
        this.isPaid = true;
    }

    public boolean isPaid() {
        return isPaid;
    }
}
