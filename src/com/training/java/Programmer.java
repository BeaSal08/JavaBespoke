package com.training.java;

public class Programmer extends Employee {
    private int yearlyBonus;

    public int getYearlyBonus() {
        return yearlyBonus;
    }

    public void setYearlyBonus(int yearlyBonus) {
        this.yearlyBonus = yearlyBonus;
    }

    public Programmer() {
        super();
        System.out.println("Programmer is created");
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

        System.out.println("Number of Leaves for Programmer: " + finalNumberOfLeaves);
    }
}
