package com.encapsulation.bankingsystem;

/*
 * Current account with lower interest and higher loan eligibility.
 */
public class CurrentAccount extends BankAccount implements Loanable {

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02; // 2% interest
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Current Account loan applied for amount: " + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 10; // eligible up to 10x balance
    }
}
