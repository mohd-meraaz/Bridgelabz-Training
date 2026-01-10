package com.bridgelabz.loanbuddy;

public class HomeLoan extends LoanApplication {

    public HomeLoan(Applicant applicant, int term) {
        super(applicant, term, 7.5);
        this.loanType = "Home Loan";
    }

    @Override
    public boolean approveLoan() {
        boolean eligible = applicant.getCreditScore() >= 650 &&
                           applicant.getIncome() >= 50000;

        setLoanApproved(eligible);
        return eligible;
    }

    @Override
    public double calculateEMI() {
        return emiFormula(1.0); // lower interest
    }
}
