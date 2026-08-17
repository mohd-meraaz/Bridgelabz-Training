package com.day12.classwork;

public class Main {
    static void main() {
       BankAccount account = new BankAccount("Meraaz", 5000);

        System.out.println(account.getAccountNumber());
        System.out.println(account.getAmount());
        account.printDetails();

//         System.out.println(account.amount);

         System.out.println(account.bankName);
    }



}
