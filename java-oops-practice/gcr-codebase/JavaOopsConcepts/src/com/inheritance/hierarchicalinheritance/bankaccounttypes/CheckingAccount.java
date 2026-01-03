package com.inheritance.hierarchicalinheritance.bankaccounttypes;

public class CheckingAccount extends BankAccount {

    private double withdrawalLimit;

    public void setWithdrawalLimit(double limit) {
        this.withdrawalLimit = limit;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}