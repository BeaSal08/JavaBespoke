package com.training.java;

import com.training.company.Employer;
import com.training.company.EmployerService;

public class Application {

    public static void main(String[] args) {
        Employee employee = new Employee();
        PeoplePerson peoplePerson = new PeoplePerson();
        peoplePerson.setHiringBonus(800);
        peoplePerson.setName("Sara");
        peoplePerson.setExperienceInYears(6);

        boolean allowedWFHPeoplePerson = isPermanentContract(TypeOfContract.CONTRACTUAL);
        if (allowedWFHPeoplePerson)
        {
            peoplePerson.setRemoteWorking(true);
        }
        employee.getDefaultLeaves();
        peoplePerson.getDefaultLeaves();

        Programmer programmer = new Programmer();
        programmer.setYearlyBonus(800);
        programmer.setName("Kim");
        programmer.setExperienceInYears(6);

        boolean allowedWFHProgrammer = isPermanentContract(TypeOfContract.PERMANENT);
        if (allowedWFHProgrammer)
        {
            programmer.setRemoteWorking(true);
        }
        employee.getDefaultLeaves();
        programmer.getDefaultLeaves();

        Admin admin = new Admin();
        admin.setQuarterlyBonus(800);
        admin.setName("Josh");
        admin.setExperienceInYears(6);

        boolean allowedWFHAdmin = isPermanentContract(TypeOfContract.PERMANENT);
        if (allowedWFHAdmin)
        {
            admin.setRemoteWorking(true);
        }
        employee.getDefaultLeaves();
        admin.getDefaultLeaves();

    }

    public static Boolean isPermanentContract(TypeOfContract typeOfContract) {
        Boolean allowedWFH =
                switch (typeOfContract) {
                    case PERMANENT -> true;
                    case CONTRACTUAL, FREELANCE -> false;
                };
        System.out.println("Work from Home allowed = " + allowedWFH);
        return allowedWFH;
    }

    enum TypeOfContract {
        PERMANENT, CONTRACTUAL, FREELANCE;
    }
}


