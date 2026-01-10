package com.bridgelabz.loanbuddy;

public abstract class LoanApplication implements IApprovable {

    protected String loanType;
    protected int term;               // in months
    protected double interestRate;    // annual
    protected Applicant applicant;

    private boolean loanApproved;     // restricted access

    public LoanApplication(Applicant applicant, int term, double interestRate) {
        this.applicant = applicant;
        this.term = term;
        this.interestRate = interestRate;
    }

    // EMI Formula: P × R × (1+R)^N / ((1+R)^N – 1)
    protected double emiFormula(double rateMultiplier) {
        double P = applicant.getLoanAmount();
        double R = (interestRate / 12 / 100) * rateMultiplier;
        int N = term;

        return (P * R * Math.pow(1 + R, N)) /
               (Math.pow(1 + R, N) - 1);
    }

    protected void setLoanApproved(boolean status) {
        this.loanApproved = status;
    }

    public boolean isLoanApproved() {
        return loanApproved;
    }
}
