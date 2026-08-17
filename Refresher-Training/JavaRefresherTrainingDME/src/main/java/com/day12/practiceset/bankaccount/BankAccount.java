package com.day12.practiceset.bankaccount;

public class BankAccount {

    private double balance;
    protected String accountType;
    String branchCode;

    public BankAccount(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("balance can't be negative");
        }else{
            this.balance = balance;
        }
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount can't be negative");
        }

        balance += amount;
    }
    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Withdrawal amount can't be negative");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful of amount " + amount);
        }
    }
}
