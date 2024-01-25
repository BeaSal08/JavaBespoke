package com.test.app;

// Inheritance uses the keyword extends
// Example for Inheritance AND Polymorphism Overriding
public class GoldCustomer extends Customer {
    private String customerPrivilege;

    //getters and setters

    public String getCustomerPrivilege() {
        return customerPrivilege;
    }

    public void setCustomerPrivilege(String customerPrivilege) {
        this.customerPrivilege = customerPrivilege;
    }
}
