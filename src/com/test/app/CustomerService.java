package com.test.app;

import java.util.ArrayList;

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

    //Lists
    //Idea: whenever there is a new customer, we add them to the list
    // 1. create list of customers
    public ArrayList<Customer> createCustomerList()
    {
        //First customer
        ArrayList<Customer> customers = new ArrayList<>(); //List of Customers
        Customer customer1 = new Customer();
        customer1.setAge(32);
        customer1.setName("Don");
        customer1.setCustomerId("BANK1000");
        customer1.setBankAccountType("Saving");
        customer1.setCreditRating(400);
        customer1.setInitialAccountBalance(8000);
        customer1.setCustomerType(CustomerType.PLATINUM);

        //Second customer
        Customer customer2 = new Customer();
        customer2.setAge(37);
        customer2.setName("Sara");
        customer2.setCustomerId("BANK1001");
        customer2.setBankAccountType("Saving");
        customer2.setCreditRating(400);
        customer2.setInitialAccountBalance(1000);
        customer2.setCustomerType(CustomerType.SILVER);

        //Third customer
        Customer customer3 = new Customer();
        customer3.setAge(22);
        customer3.setName("Mark");
        customer3.setCustomerId("BANK1002");
        customer3.setBankAccountType("Investment");
        customer3.setCreditRating(900);
        customer3.setInitialAccountBalance(18000);
        customer3.setCustomerType(CustomerType.DIAMOND);

        //add customers to arraylist
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

        System.out.println("Number of customers: " + customers.size());
        return customers;
    }


    // 2. use list to loop through for bank acc creation
    public void openBankAccount(ArrayList<Customer> customers)
    {
        for(Customer customer : customers )
        {
        if(customer.getBankAccountType() != null)
        {
            if(customer.getBankAccountType().equals("Saving"))
            {
                if(customer.getInitialAccountBalance() >= 3000)
                {
                    System.out.println("Savings bank account opened for customer: " + customer.getName() );
                    addPrivilege(customer.getCreditRating(), customer.isKycDone());
                    int flatCashBack = calculateFlatCashback(customer.getCustomerType());
                }
                else
                {
                    System.out.println("3000 is the minimum required balance for Savings bank account");
                }
            }
            else if(customer.getBankAccountType().equals("Investment"))
            {
                if((customer.getInitialAccountBalance() >= 10000)
                        && (customer.getCreditRating() >= 500)
                        && (customer.getAge() >= 21))
                {
                    System.out.println("Investment bank account opened for customer: " + customer.getName());
                    addPrivilege(customer.getCreditRating(), customer.isKycDone());
                    int flatCashBack = calculateFlatCashback(customer.getCustomerType());
                }
                else
                {
                    System.out.println("10000 is the minimum required balance for Investment bank account");
                }
            }
        }
        }
    }
}
