package com.inheritance.hierarchicalinheritance.bankaccounttypes;

import java.util.Scanner;

public class BankAccountApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = null;

        while (true) {
            System.out.println("\n===== Bank Account Management System =====");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Checking Account");
            System.out.println("3. Create Fixed Deposit Account");
            System.out.println("4. Display Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    SavingsAccount savings = new SavingsAccount();

                    System.out.print("Enter Account Number: ");
                    int sAccNo = sc.nextInt();

                    System.out.print("Enter Balance: ");
                    double sBalance = sc.nextDouble();

                    System.out.print("Enter Interest Rate: ");
                    double rate = sc.nextDouble();

                    savings.setDetails(sAccNo, sBalance);
                    savings.setInterestRate(rate);

                    account = savings;
                    System.out.println("Savings Account created successfully!");
                    break;

                case 2:
                    CheckingAccount checking = new CheckingAccount();

                    System.out.print("Enter Account Number: ");
                    int cAccNo = sc.nextInt();

                    System.out.print("Enter Balance: ");
                    double cBalance = sc.nextDouble();

                    System.out.print("Enter Withdrawal Limit: ");
                    double limit = sc.nextDouble();

                    checking.setDetails(cAccNo, cBalance);
                    checking.setWithdrawalLimit(limit);

                    account = checking;
                    System.out.println("Checking Account created successfully!");
                    break;

                case 3:
                    FixedDepositAccount fixed = new FixedDepositAccount();

                    System.out.print("Enter Account Number: ");
                    int fAccNo = sc.nextInt();

                    System.out.print("Enter Balance: ");
                    double fBalance = sc.nextDouble();

                    System.out.print("Enter Lock Period (years): ");
                    int years = sc.nextInt();

                    fixed.setDetails(fAccNo, fBalance);
                    fixed.setLockPeriod(years);

                    account = fixed;
                    System.out.println("Fixed Deposit Account created successfully!");
                    break;

                case 4:
                    if (account != null) {
                        account.displayAccountType(); 
                        account.showBalance();
                    } else {
                        System.out.println("No account created yet.");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using the Bank System!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
