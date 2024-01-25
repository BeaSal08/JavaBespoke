package com.training.java;

public class Admin extends Employee {
    private int quarterlyBonus;

    public int getQuarterlyBonus() {
        return quarterlyBonus;
    }

    public void setQuarterlyBonus(int quarterlyBonus) {
        this.quarterlyBonus = quarterlyBonus;
    }

    public Admin() {
        super();
        System.out.println("Admin is created");
    }

    void getDefaultLeaves(){
        int finalNumberOfLeaves;

        if(super.getExperienceInYears() <= 5)
        {
            finalNumberOfLeaves = super.numberOfLeaves + 5;
        }
        else
        {
            finalNumberOfLeaves = super.numberOfLeaves + 10;
        }

        System.out.println("Number of Leaves for Admin: " + finalNumberOfLeaves);
    }
}
