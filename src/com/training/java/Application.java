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
                "\nMonthly Pay: " + salary.getMonthlyPay());

        Employee employee2 = new Employee(5,"Deba", true);
        Salary salary2 = employerService.calculateSalary(500, 500);
        employee2.setSalary(salary2);

        System.out.println("=== Employee Details ===" +
                "\nMonthly Pay: " + salary2.getMonthlyPay());

    }
}
