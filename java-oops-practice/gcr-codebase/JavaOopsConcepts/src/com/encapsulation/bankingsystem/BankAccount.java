package com.encapsulation.bankingsystem;

/*
 * Abstract base class for all bank accounts.
 * Demonstrates encapsulation and abstraction.
 */
public abstract class BankAccount {

    private int accountNumber;
    private String holderName;
    private double balance;

    // Encapsulation: setters with validation
    public void setAccountDetails(int accountNumber, String holderName, double balance) {
        if (accountNumber <= 0 || balance < 0) {
            System.out.println("Invalid account details!");
            return;
        }
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getters (read-only access)
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // Concrete method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Concrete method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Abstract method
    public abstract double calculateInterest();

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + holderName);
        System.out.println("Balance: " + balance);
    }
}
