package com.collections.bankingsystem;

public class BankingSystemApp {
    public static void main(String[] args) {

        BankingSystem bank = new BankingSystem();

        bank.createAccount(101, 5000);
        bank.createAccount(102, 3000);
        bank.createAccount(103, 7000);

        bank.deposit(101, 1000);

        bank.requestWithdrawal(102, 2000);
        bank.requestWithdrawal(103, 8000);
        bank.requestWithdrawal(101, 3000);

        bank.processWithdrawals();
        bank.displaySortedByBalance();
    }
}
