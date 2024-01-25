package com.training.java;

import com.training.company.Employer;
import com.training.company.EmployerService;

public class Application {
    public static void main(String[] args) {
        Employee employee = new Employee(5,"Deba", true);
        EmployerService employerService = new EmployerService(); //bc we need to calc the salary info

        Salary salary = new Salary();
        salary.setBasicPay(6000);

        int finalPay = employerService.calculateSalary(salary); //uses the 1st method of calculateSalary
        salary.setMonthlyPay(finalPay);

        System.out.println("=== Employee Details ===" +
                "\nmMonthly Pay: " + salary.getMonthlyPay());

    }
}
