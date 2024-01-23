package com.test.app;

// Class names start with capital letters
public class Customer {
    //set up fields for the Customer (bc it is a blueprint)
    private int age;
    private long phoneNumber;
    private boolean isKycDone;
    private char areaCode;
    private String name;

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
}
