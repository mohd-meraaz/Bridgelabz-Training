package com.day12.practiceset.bankaccount;

public class BankAccountMain {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(2300.0);

        System.out.println("Initial balance: " + bankAccount.getBalance());

        bankAccount.deposit(500);
        System.out.println("After deposit: " + bankAccount.getBalance());

        bankAccount.withdraw(500);
        System.out.println("After withdrawal: " + bankAccount.getBalance());

        bankAccount.withdraw(5000);   // Should be rejected

        bankAccount.withdraw(-100);   // Should be rejected

        System.out.println("Final balance: " + bankAccount.getBalance());
    }
}
