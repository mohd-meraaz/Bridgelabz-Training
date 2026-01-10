package com.bridgelabz.artify;
public class User {
    private String name;
    private double walletBalance;

    public User(String name, double walletBalance) {
        this.name = name;
        this.walletBalance = walletBalance;
    }

    protected boolean deductBalance(double amount) {
        if (walletBalance >= amount) {
            walletBalance -= amount;
            return true;
        }
        return false;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public String getName() {
        return name;
    }
}
