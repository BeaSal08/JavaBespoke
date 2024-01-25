package com.test.app;

public class Loan {
    private int loanAmount;
    private LoanTypes loanTypes;
    private int interest;

    public int getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }

    public LoanTypes getLoanTypes() {
        return loanTypes;
    }

    public void setLoanTypes(LoanTypes loanTypes) {
        this.loanTypes = loanTypes;
    }

    public int getInterest() {
        return interest;
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }
}
