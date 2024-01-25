package com.test.app;

//abstract class must at least have 1 abstract method
abstract class LoanService {
    private LoanTypes loanTypes;

    //abstract methods cannot have any body
    abstract void applyLoan(Customer customer);
    abstract void calculateLoanCap(LoanTypes loanTypes);
    void verifyApplicant() //non abstract
    {
        System.out.println("Applicant verification for loan started");
    }

}
