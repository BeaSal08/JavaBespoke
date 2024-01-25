package com.training.company;

import com.training.java.Employee;

public class EmploymentService implements Employment{

    @Override
    public String[] attendTraining(Employee employee) {
        String[] training = new String[3];

        if(employee.getTypeOfEmployee() == TypeOfEmployee.PEOPLEPERSON)
        {
            training = new String[]{"Employee Onboarding", "Employee Wellness", "Diversity & Inclusion"};
        }
        else if(employee.getTypeOfEmployee() == TypeOfEmployee.PROGRAMMER)
        {
            training = new String[]{"Azure Cloud Fundamentals", "AWS Cloud Fundamentals", "JavaScript Basics"};
        }
        else if(employee.getTypeOfEmployee() == TypeOfEmployee.ADMIN)
        {
            training = new String[]{"Accounting Basics", "Employee Administration"};
        }

        for( int i = 0; i < training.length; i++)
        {
            System.out.println("Attended Training: " + training[i]);
        }

        return training;
    }

    @Override
    public void signEmploymentDocuments(Employee employee) {
        System.out.println("Signed all employment related documents");
    }

    @Override
    public String receiveLaptop(TypeOfEmployee typeOfEmployee) {
        String laptop = switch (typeOfEmployee)
        {
            case PEOPLEPERSON, ADMIN -> "Windows";
            case PROGRAMMER -> "Mac";
        };

        System.out.println("Received Laptop: " + laptop);
        return laptop;
    }
}
