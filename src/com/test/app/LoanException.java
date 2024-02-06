package com.test.app;

public class LoanException extends RuntimeException {

    private String loanType;

    // calls parent constructor
    public LoanException(String message) {
        super(message);
    }

    // overriding the getMessage method to log a specific message
    @Override
    public String getMessage() {
        return super.getMessage() + " for loan :" + loanType;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }
}