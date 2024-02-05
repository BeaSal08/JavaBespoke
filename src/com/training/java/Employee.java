package com.training.java;

import com.training.company.TypeOfEmployee;

public class Employee {
    //variables
    private int experienceInYears;
    private String name;
    private boolean remoteWorking;
    private Salary salary;

    private TypeOfEmployee typeOfEmployee;

    private String dob;

    //getters and setters

    protected int getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }

    protected String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected boolean isRemoteWorking() {
        return remoteWorking;
    }

    int numberOfLeaves = 5;

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public void setRemoteWorking(boolean remoteWorking) {
        this.remoteWorking = remoteWorking;
    }

    public int getNumberOfLeaves() {
        return numberOfLeaves;
    }

    public void setNumberOfLeaves(int numberOfLeaves) {
        this.numberOfLeaves = numberOfLeaves;
    }

    public TypeOfEmployee getTypeOfEmployee() {
        return typeOfEmployee;
    }

    public void setTypeOfEmployee(TypeOfEmployee typeOfEmployee) {
        this.typeOfEmployee = typeOfEmployee;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    // constructor
//    public Employee(int experienceInYears, String name, boolean remoteWorking) {
//        this.experienceInYears = experienceInYears;
//        this.name = name;
//        this.remoteWorking = remoteWorking;
//    }

    public Employee() {
        System.out.println("Employee is Created");
    }

    //method
    void getDefaultLeaves(){
        System.out.println("Number of Leaves for Employee: " + numberOfLeaves);
    }
}
