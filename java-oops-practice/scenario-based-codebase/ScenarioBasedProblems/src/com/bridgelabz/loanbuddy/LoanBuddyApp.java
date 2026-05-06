package com.bridgelabz.loanbuddy;

public class LoanBuddyApp {
    public static void main(String[] args) {

        Applicant applicant = new Applicant(
                "Rohit", 720, 60000, 500000);

        LoanApplication loan = new HomeLoan(applicant, 240);

        if (loan.approveLoan()) {
            System.out.println("Loan Approved.... ");
            System.out.println("Monthly EMI: " + loan.calculateEMI());
        } else {
            System.out.println("Loan Rejected....");
        }
    }
}
