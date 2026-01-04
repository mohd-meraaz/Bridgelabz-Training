package com.encapsulation.bankingsystem;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Main application class for Banking System.
 * Demonstrates polymorphism using BankAccount reference.
 */
public class BankingApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<BankAccount> accounts = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Banking System =====");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Calculate Interest");
            System.out.println("6. Loan Eligibility");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    SavingsAccount sa = new SavingsAccount();
                    createAccount(sc, sa);
                    accounts.add(sa);
                    System.out.println("Savings Account created!");
                    break;

                case 2:
                    CurrentAccount ca = new CurrentAccount();
                    createAccount(sc, ca);
                    accounts.add(ca);
                    System.out.println("Current Account created!");
                    break;

                case 3:
                    performDeposit(sc, accounts);
                    break;

                case 4:
                    performWithdraw(sc, accounts);
                    break;

                case 5:
                    for (BankAccount acc : accounts) {
                        System.out.println("\n--------------------");
                        acc.displayAccountDetails();
                        System.out.println("Interest: " + acc.calculateInterest());
                    }
                    break;

                case 6:
                    for (BankAccount acc : accounts) {
                        System.out.println("\n--------------------");
                        acc.displayAccountDetails();
                        Loanable loan = (Loanable) acc;
                        System.out.println("Loan Eligibility: " + loan.calculateLoanEligibility());
                    }
                    break;

                case 7:
                    System.out.println("Exiting Banking System...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // Helper methods

    private static void createAccount(Scanner sc, BankAccount acc) {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        acc.setAccountDetails(accNo, name, bal);
    }

    private static BankAccount findAccount(int accNo, ArrayList<BankAccount> accounts) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber() == accNo) {
                return acc;
            }
        }
        return null;
    }

    private static void performDeposit(Scanner sc, ArrayList<BankAccount> accounts) {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        BankAccount acc = findAccount(accNo, accounts);
        if (acc != null) {
            System.out.print("Enter Deposit Amount: ");
            double amt = sc.nextDouble();
            acc.deposit(amt);
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void performWithdraw(Scanner sc, ArrayList<BankAccount> accounts) {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        BankAccount acc = findAccount(accNo, accounts);
        if (acc != null) {
            System.out.print("Enter Withdraw Amount: ");
            double amt = sc.nextDouble();
            acc.withdraw(amt);
        } else {
            System.out.println("Account not found.");
        }
    }
}
