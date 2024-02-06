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
//            default : throw new RuntimeException(loanType+ " is not a valid loan type!");
            default : throw new LoanException(loanType + " is not a valid loan type");
            // if we use LoanException, it gets the contents nung line 20
                // and yung message specified sa getMessage na inoverride from LoanException.java
        }
    }

}