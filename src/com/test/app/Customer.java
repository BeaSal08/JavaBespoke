package com.test.app;

// Class names start with capital letters
public class Customer {
    //set up fields for the Customer (bc it is a blueprint)
    private int age;
    private long phoneNumber;
    private boolean isKycDone;
    private char areaCode;
    private String name;
    private int creditRating;
    private String bankAccountType;

    int initialAccountBalance = 2000;

    //constructor:
    public Customer() {
        System.out.println("A customer is created");
    }

    //method (override example, masa GoldCustomer yung isa):
    public void getDefaultPrivileges()
    {
        System.out.println("Default privileges are: ATM Card, Free ATM Withdrawal, 1% Interest, 1% Cashback");
    }


    // getters-setters, so private fields can be accessed (by Main.java for example)
    // right click > generate > Getters and Setters > select fields u want > OK
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isKycDone() {
        return isKycDone;
    }

    public void setKycDone(boolean kycDone) {
        isKycDone = kycDone;
    }

    public char getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(char areaCode) {
        this.areaCode = areaCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreditRating() {
        return creditRating;
    }

    public void setCreditRating(int creditRating) {
        this.creditRating = creditRating;
    }

    public String getBankAccountType() {
        return bankAccountType;
    }

    public void setBankAccountType(String bankAccountType) {
        this.bankAccountType = bankAccountType;
    }
}
