package com.training.java;

import com.training.company.Employer;
import com.training.company.EmployerService;
import com.training.company.EmploymentService;
import com.training.company.TypeOfEmployee;

public class Application {

    public static void main(String[] args) {
        //Employee #1
//        Employee employee = new Employee();
//        EmployerService employerService = new EmployerService();
//
//        Salary salary = employerService.calculateSalary(1000, 1000);
//        employee.setSalary(salary);
//        employee.setName("Sara");
//        employee.setExperienceInYears(6);
//        employee.setTypeOfEmployee(TypeOfEmployee.PEOPLEPERSON);
//
//        EmploymentService employmentService = new EmploymentService();
//        employmentService.fillJobs(employee);

        // Employee #2
        Employee employee2 = new Employee();
        EmployerService employerService2 = new EmployerService();

        Salary salary2 = employerService2.calculateSalary(1000, 1000);
        employee2.setSalary(salary2);
        employee2.setName("Kim");
        employee2.setExperienceInYears(6);
        employee2.setTypeOfEmployee(TypeOfEmployee.PROGRAMMER);

        EmploymentService employmentService2 = new EmploymentService();
        employmentService2.fillJobs(employee2);

    }
}


