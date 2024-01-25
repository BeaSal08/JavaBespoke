package com.training.java;

public class Employee {
    //variables
    private int experienceInYears;
    private String name;
    private boolean remoteWorking;
    private Salary salary;

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

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public void setRemoteWorking(boolean remoteWorking) {
        this.remoteWorking = remoteWorking;
    }

    // constructor
    public Employee(int experienceInYears, String name, boolean remoteWorking) {
        this.experienceInYears = experienceInYears;
        this.name = name;
        this.remoteWorking = remoteWorking;
    }
}
