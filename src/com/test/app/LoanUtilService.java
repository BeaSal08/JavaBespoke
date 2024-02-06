package com.test.app;

public class LoanUtilService {

    public void calculateInterestRates(String loanType)
    {
        int interestRate =0;

        switch(loanType)
        {
            case "HOME" : interestRate = 10;
                break;
            case "PERSONAL" : interestRate = 12;
                break;
            case "CAR" : interestRate = 10;
                break;
            case "EDUCATION" : interestRate = 7;
                break;
            default : throw new RuntimeException(loanType+ " is not a valid loan type");
        }
    }

}