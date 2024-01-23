package com.training.java;

public class Application {
    public static void main(String[] args) {
        Employee employee = new Employee(5, "Deba", true);

        System.out.println("==== Employee Details ====" +
                "\nExperienceInYears: " + employee.getExperienceInYears() +
                "\nName: " + employee.getName() +
                "\nisRemoteWorking: " + employee.isRemoteWorking()
        );

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
