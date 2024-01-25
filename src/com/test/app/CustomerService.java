package com.test.app;

// EXAMPLE FOR POLYMORPHISM OVERLOADING
// overloading: same method, diff params, same class
// I guess you can say it's good for when you want to use the same func name but it has diff functionalities
// based on the available parameters. Makes it less confusing to use I guess?
public class CustomerService {
    //service - usually has the business functions; called by main
    //create 2 diff methods
    // checks creditRating of the customer and lets you know the privilege they have

    // used when customer's kyc is not done but credit rating is avail
    public void addPrivilege(int creditRating){
        if (creditRating >= 700)
        {
            System.out.println("Customer privileges are: locker and 1% cashback in all transactions");
        }
    }

    // used when customer's kyc is done and credit rating is avail
    public void addPrivilege(int creditRating, boolean isKycDone){
        if ((creditRating >= 700) && (isKycDone))
        {
            System.out.println("Customer privileges are: locker, 1% cashback in all transactions, and a personal banker");
        }
        else if ((creditRating >= 500) && (creditRating <= 700) && (isKycDone))
        {
            System.out.println("Customer privileges are: locker, 1% cashback in all transactions");
        }
        else
        {
            System.out.println("Customer privileges are: locker");
        }
    }
    public int calculateFlatCashback(CustomerType customerType){
        int flatCashback = switch(customerType)
        {
            case GOLD,DIAMOND -> 1000;
            //break; <-- if we want to get out of the switch case once a condition is met, we can use break
            default -> 500;
        };

        return  flatCashback;
    }
    public String openBankAccount(Customer customer)
    {
        String bankAccountOpened = null;
        if(customer.getBankAccountType() != null)
        {
            if(customer.getBankAccountType().equals("Saving"))
            {
                if(customer.getInitialAccountBalance() >= 3000)
                {
                    System.out.println("Savings bank account opened for customer");
                    addPrivilege(customer.getCreditRating(), customer.isKycDone());
                    int flatCashBack = calculateFlatCashback(customer.getCustomerType());
                    bankAccountOpened = "Yes";
                }
                else
                {
                    System.out.println("3000 is the minimum required balance for Savings bank account");
                    bankAccountOpened = "No";
                }
            }
            else if(customer.getBankAccountType().equals("Investment"))
            {
                if((customer.getInitialAccountBalance() >= 10000)
                        && (customer.getCreditRating() >= 500)
                        && (customer.getAge() >= 21))
                {
                    System.out.println("Investment bank account opened for customer");
                    addPrivilege(customer.getCreditRating(), customer.isKycDone());
                    int flatCashBack = calculateFlatCashback(customer.getCustomerType());
                    bankAccountOpened = "Yes";
                }
                else
                {
                    System.out.println("10000 is the minimum required balance for Investment bank account");
                    bankAccountOpened = "No";
                }
            }
        }
        return bankAccountOpened;
    }
}
