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
}
