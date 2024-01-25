package com.training.company;

import com.training.java.Employee;

public interface Employment {
    String[] attendTraining(Employee employee);
    void signEmploymentDocuments(Employee employee);

    String receiveLaptop(TypeOfEmployee typeOfEmployee);
}
