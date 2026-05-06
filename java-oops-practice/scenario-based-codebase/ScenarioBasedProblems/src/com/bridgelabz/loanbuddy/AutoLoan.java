package com.bridgelabz.loanbuddy;

public class AutoLoan extends LoanApplication {

    public AutoLoan(Applicant applicant, int term) {
        super(applicant, term, 9.0);
        this.loanType = "Auto Loan";
    }

    @Override
    public boolean approveLoan() {
        boolean eligible = applicant.getCreditScore() >= 600 &&
                           applicant.getIncome() >= 30000;

        setLoanApproved(eligible);
        return eligible;
    }

    @Override
    public double calculateEMI() {
        return emiFormula(1.1); // slightly higher risk
    }
}
