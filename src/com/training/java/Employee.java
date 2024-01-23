package com.training.java;

public class Employee {
    private int experienceInYears;
    private String name;
    private boolean remoteWorking;

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

    public void setRemoteWorking(boolean remoteWorking) {
        this.remoteWorking = remoteWorking;
    }

    public Employee(int experienceInYears, String name, boolean remoteWorking) {
        this.experienceInYears = experienceInYears;
        this.name = name;
        this.remoteWorking = remoteWorking;
    }
}
