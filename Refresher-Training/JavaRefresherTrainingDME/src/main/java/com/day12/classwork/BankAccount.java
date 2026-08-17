package com.day12.classwork;

public class BankAccount {

    public static int totalAccount = 0;


    private int accountNumber;
    private String name;
    private double amount;


    protected String bankName = "SBI Bank";

    public BankAccount(String name) {
        this.name = name;
        this.accountNumber = (int) (Math.random() * 100000);
        totalAccount++;
    }


    public BankAccount(String name, double amount) {
        this.name = name;
        this.amount = amount;
        this.accountNumber = (int) (Math.random() * 100000);
        totalAccount++;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Amount: " + amount);
        System.out.println("Bank: " + bankName);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount >= 0) {
            this.amount = amount;
        } else {
            System.out.println("Amount cannot be negative");
        }
    }

    protected void showBankInfo() {
        System.out.println("Bank: " + bankName);
    }


}