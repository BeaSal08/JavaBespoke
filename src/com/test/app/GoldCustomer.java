package com.test.app;

// Inheritance uses the keyword extends
// Example for Inheritance AND Polymorphism Overriding
public class GoldCustomer extends Customer {
    private String customerPrivilege;
    private int initialAccountBalance = super.initialAccountBalance + 5000;
    // super = used to access parent class instance variable initialAccountBalance (kase base customer gets 2k, gold gets 7k)

    //getters and setters

    public String getCustomerPrivilege() {
        return customerPrivilege;
    }

    public void setCustomerPrivilege(String customerPrivilege) {
        this.customerPrivilege = customerPrivilege;
    }

    public int getInitialAccountBalance() {
        return initialAccountBalance;
    }

    public void setInitialAccountBalance(int initialAccountBalance) {
        this.initialAccountBalance = initialAccountBalance;
    }
}
