package com.bridgelabz.mybank;

import java.util.Scanner;

// Main class
public class MyBank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account savingAccount = null;
        Account currentAccount = null;

        while (true) {
            System.out.println("\n========= MyBank Application =========");
            System.out.println("1. Create Saving Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Check Balance");
            System.out.println("4. Deposit Amount");
            System.out.println("5. Withdraw Amount");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Interest Rate: ");
                    double interest = sc.nextDouble();

                    System.out.print("Enter Initial Balance: ");
                    double sBalance = sc.nextDouble();

                    savingAccount = new SavingAccount(interest, sBalance);
                    System.out.println("Saving Account created successfully!");
                    break;

                case 2:
                    System.out.print("Enter Overdraft Limit: ");
                    double limit = sc.nextDouble();

                    currentAccount = new CurrentAccount(limit);
                    System.out.println("Current Account created successfully!");
                    break;

                case 3:
                    System.out.println("\n--- Account Balances ---");
                    if (savingAccount != null)
                        savingAccount.checkBalance();
                    else
                        System.out.println("Saving Account not created.");

                    if (currentAccount != null)
                        currentAccount.checkBalance();
                    else
                        System.out.println("Current Account not created.");
                    break;

                case 4:
                    System.out.print("Deposit to (1. Saving / 2. Current): ");
                    int depChoice = sc.nextInt();

                    System.out.print("Enter Amount: ");
                    double depAmount = sc.nextDouble();

                    if (depChoice == 1 && savingAccount != null) {
                        savingAccount.deposite(depAmount);
                    } else if (depChoice == 2 && currentAccount != null) {
                        currentAccount.deposite(depAmount);
                    } else {
                        System.out.println("Account not available.");
                    }
                    break;

                case 5:
                    System.out.print("Withdraw from (1. Saving / 2. Current): ");
                    int withChoice = sc.nextInt();

                    System.out.print("Enter Amount: ");
                    double withAmount = sc.nextDouble();

                    if (withChoice == 1 && savingAccount != null) {
                        savingAccount.withdraw(withAmount);
                    } else if (withChoice == 2 && currentAccount != null) {
                        currentAccount.withdraw(withAmount);
                    } else {
                        System.out.println("Account not available.");
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using MyBank!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
