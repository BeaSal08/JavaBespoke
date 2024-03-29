package com.training.company;

import java.time.LocalDate;

public class Job {
    private String jobName;
    private TypeOfEmployee typeOfEmployee;
    private long minSalary;
    private long maxSalary;
    private String location;
    private String jobId;

    private LocalDate jobPostingDate;

    private LocalDate jobClosureDate;

    private String jobDescription;

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public TypeOfEmployee getTypeOfEmployee() {
        return typeOfEmployee;
    }

    public void setTypeOfEmployee(TypeOfEmployee typeOfEmployee) {
        this.typeOfEmployee = typeOfEmployee;
    }

    public long getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(long minSalary) {
        this.minSalary = minSalary;
    }

    public long getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(long maxSalary) {
        this.maxSalary = maxSalary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public LocalDate getJobPostingDate() {
        return jobPostingDate;
    }

    public void setJobPostingDate(LocalDate jobPostingDate) {
        this.jobPostingDate = jobPostingDate;
    }

    public LocalDate getJobClosureDate() {
        return jobClosureDate;
    }

    public void setJobClosureDate(LocalDate jobClosureDate) {
        this.jobClosureDate = jobClosureDate;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }
}
