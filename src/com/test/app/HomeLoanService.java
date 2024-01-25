package com.test.app;
//subclass of abstract class
public class HomeLoanService extends LoanService {
    //hover, click on implement methods, ok
    @Override
    public void applyLoan(Customer customer) {
        if(customer.getLoan().getLoanTypes() != null)
        {
            if(customer.getLoan().getLoanTypes().equals(LoanTypes.HOME))
            {
                Loan loan = new Loan();
                int finalLoanAmount = customer.getLoan().getLoanAmount()*80/100;
                int maxLoanAmount = calculateLoanCap(LoanTypes.HOME);

                if (finalLoanAmount > maxLoanAmount)
                {
                    System.out.println("The max loan cap has been reached for home loan. Loan cant be disbursed");
                }
                else
                {
                    loan.setLoanAmount(finalLoanAmount);
                    loan.setInterest(finalLoanAmount/10);
                    customer.setLoan(loan);
                    System.out.println("Home loan disbursed. Final loan amount: " + finalLoanAmount);
                }
            }
            else
            {
                System.out.println("You should visit a different loan department");
            }
        }
    }

    @Override
    int calculateLoanCap(LoanTypes loanTypes) {
        int maxLoanAmount = 0;
        if(loanTypes.equals(LoanTypes.HOME))
        {
            maxLoanAmount = 10000;
        }
        return maxLoanAmount;
    }

}
