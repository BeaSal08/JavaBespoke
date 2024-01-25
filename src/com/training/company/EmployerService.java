package com.training.company;

import com.training.java.Salary;

public class EmployerService {
    public int calculateSalary(Salary salary)
    {
        int hra = salary.getBasicPay()/10;
        int medicalAllowance = salary.getBasicPay()/20;
        int finalSalary = hra + medicalAllowance + salary.getBasicPay();
        return finalSalary;
    }

    public Salary calculateSalary(int hra, int medicalAllowance)
    {
        Salary salary = new Salary();
        salary.setHra(hra);
        salary.setMedicalAllowance(medicalAllowance);

        int variablePay = medicalAllowance+hra/2;
        int finalSalary = hra + medicalAllowance + 5000 + variablePay;
        salary.setMonthlyPay(finalSalary);
        return salary;
    }
}
