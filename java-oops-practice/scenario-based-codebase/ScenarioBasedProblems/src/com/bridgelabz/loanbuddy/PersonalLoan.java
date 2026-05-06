package com.bridgelabz.loanbuddy;

public class PersonalLoan extends LoanApplication {

    public PersonalLoan(Applicant applicant, int term) {
        super(applicant, term, 12.0);
        this.loanType = "Personal Loan";
    }

    @Override
    public boolean approveLoan() {
        boolean eligible = applicant.getCreditScore() >= 700 &&
                           applicant.getIncome() >= 40000;

        setLoanApproved(eligible);
        return eligible;
    }

    @Override
    public double calculateEMI() {
        return emiFormula(1.2); // highest risk
    }
}
