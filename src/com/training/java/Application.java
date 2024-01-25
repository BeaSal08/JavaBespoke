package com.training.java;

import com.training.company.Employer;

public class Application {
    public static void main(String[] args) {
        Employer employer = new Employer();
        employer.display();

        Employee employee = new Employee(5, "Deba", true);

        System.out.println("==== Employee Details ====" +
                "\nExperienceInYears: " + employee.getExperienceInYears() +
                "\nName: " + employee.getName() +
                "\nisRemoteWorking: " + employee.isRemoteWorking()
        );

        updateEmployee(employee); // calls the updateEmployee method
    }

    private static void updateEmployee(Employee employee) { //updates employee info by setting new field info
        employee.setExperienceInYears(10);
        employee.setName("Sam");
        employee.setRemoteWorking(false);

        System.out.println("==== Updated Employee Details ====" +
                "\nExperienceInYears: " + employee.getExperienceInYears() +
                "\nName: " + employee.getName() +
                "\nisRemoteWorking: " + employee.isRemoteWorking()
        );
    }
}
