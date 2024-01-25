package com.training.company;

import com.training.java.Employee;

import javax.print.attribute.standard.JobName;
import java.util.ArrayList;
import java.util.HashMap;

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

    public ArrayList createJobListing()
    {
        ArrayList<Job> jobs = new ArrayList<>();

        Job job1 = new Job();
        job1.setJobName("People Connect Specialist");
        job1.setTypeOfEmployee(TypeOfEmployee.PEOPLEPERSON);
        job1.setLocation("Manila");
        job1.setMinSalary(5000);
        job1.setMaxSalary(10000);
        job1.setJobId("ABC100");

        Job job2 = new Job();
        job2.setJobName("DevOps Engineer");
        job2.setTypeOfEmployee(TypeOfEmployee.PROGRAMMER);
        job2.setLocation("Remote");
        job2.setMinSalary(8000);
        job2.setMaxSalary(15000);
        job2.setJobId("ABC102");

        Job job3 = new Job();
        job3.setJobName("FullStack Engineer");
        job3.setTypeOfEmployee(TypeOfEmployee.PROGRAMMER);
        job3.setLocation("Paris");
        job3.setMinSalary(7000);
        job3.setMaxSalary(12000);
        job3.setJobId("ABC101");

        jobs.add(job1);
        jobs.add(job2);
        jobs.add(job3);

        System.out.println("Length of List: " + jobs.size());
        return jobs;
    }

    public void fillJobs(Employee employee)
    {
        HashMap<String,Object> jobMap = new HashMap<>();
        ArrayList<Job> jobs = createJobListing();

        for (Job job:jobs)
        {
            jobMap.put(job.getJobId(),job.getJobName());
        }

        if(employee.getTypeOfEmployee().equals(TypeOfEmployee.PEOPLEPERSON))
        {
            System.out.println("You are eligible to apply for the job: " + jobMap.get("ABC100"));
        }
        else if(employee.getTypeOfEmployee().equals(TypeOfEmployee.PROGRAMMER))
        {
            System.out.println("You are eligible to apply for the job: " + jobMap.get("ABC101") + " and " + jobMap.get("ABC102"));
        }
    }
}
