package com.day12.practiceset.bankaccount;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(double balance) {
        super(balance);
    }

    public void showAccountType() {
        accountType = "Savings";
        System.out.println(accountType);
    }
}