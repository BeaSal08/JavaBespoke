package com.training.java;

public class PeoplePerson extends Employee {
    private int hiringBonus;

    public int getHiringBonus() {
        return hiringBonus;
    }

    public void setHiringBonus(int hiringBonus) {
        this.hiringBonus = hiringBonus;
    }

    public PeoplePerson() {
        super();
        System.out.println("People Person is created");
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

        System.out.println("Number of Leaves for People Person: " + finalNumberOfLeaves);
    }
}
