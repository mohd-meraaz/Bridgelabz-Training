package com.encapsulation.bankingsystem;

/*
 * Savings account with interest and loan facility.
 */
public class SavingsAccount extends BankAccount implements Loanable {

    @Override
    public double calculateInterest() {
        return getBalance() * 0.04; // 4% interest
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Savings Account loan applied for amount: " + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 5; // eligible up to 5x balance
    }
}
