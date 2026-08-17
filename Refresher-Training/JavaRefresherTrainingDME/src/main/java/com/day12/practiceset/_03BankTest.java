package com.day12.practiceset;

import com.day12.practiceset.bankaccount.BankAccount;

public class _03BankTest {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000);

        // private: not accessible
//         account.balance = 5000;

        // default: not accessible
        // account.branchCode = "BPL001";

        // protected: NOT directly accessible here
        // account.accountType = "Savings";

        // public: accessible
        account.deposit(500);

        System.out.println(account.getBalance());
    }
}
