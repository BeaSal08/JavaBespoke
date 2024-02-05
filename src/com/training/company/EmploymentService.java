package com.training.company;

import com.training.java.Employee;

import javax.print.attribute.standard.JobName;
import java.time.LocalDate;
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

        //valid
        Job job1 = new Job();
        job1.setJobName("People Connect Specialist");
        job1.setTypeOfEmployee(TypeOfEmployee.PEOPLEPERSON);
        job1.setLocation("Manila");
        job1.setMinSalary(5000);
        job1.setMaxSalary(10000);
        job1.setJobId("ABC100");
        job1.setJobPostingDate(LocalDate.of(2024,1,13));
        job1.setJobClosureDate(LocalDate.of(2024,2,24));
        job1.setJobDescription("This is 20 characters long so this should pass the validation");

        //valid
        Job job2 = new Job();
        job2.setJobName("DevOps Engineer");
        job2.setTypeOfEmployee(TypeOfEmployee.PROGRAMMER);
        job2.setLocation("Remote");
        job2.setMinSalary(8000);
        job2.setMaxSalary(15000);
        job2.setJobId("ABC102");
        job2.setJobPostingDate(LocalDate.of(2024,2,13));
        job2.setJobClosureDate(LocalDate.of(2024,3,24));
        job2.setJobDescription("This is 20 characters long so this should pass the validation");

        Job job3 = new Job();
        job3.setJobName("FullStack Engineer");
        job3.setTypeOfEmployee(TypeOfEmployee.PROGRAMMER);
        job3.setLocation("Paris");
        job3.setMinSalary(7000);
        job3.setMaxSalary(12000);
        job3.setJobId("ABC101");
        job2.setJobPostingDate(LocalDate.of(2024,2,13));
        job2.setJobClosureDate(LocalDate.of(2023,3,24));
        job2.setJobDescription("This is not 20 chars long");

        jobs.add(job1);
        jobs.add(job2);
        jobs.add(job3);

//        System.out.println("Length of List: " + jobs.size());
//        return jobs;

        ArrayList<Job> validJobList = new ArrayList<>();

        for (Job job : jobs)
        {
            Boolean validJob = validateJobListing(job);
            if(validJob.equals(true))
            {
                validJobList.add(job);
            }
        }
        System.out.println("Length of List: " + validJobList.size());
        return validJobList;
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

    public Boolean validateJobListing(Job job)
    {
        LocalDate date = LocalDate.now();
        boolean validJob = true;

        if((job.getJobClosureDate() != null) && (job.getJobPostingDate() != null))
        {
            if((job.getJobClosureDate().isBefore(job.getJobPostingDate()))
            || (job.getJobClosureDate().equals(date))
            || (job.getJobPostingDate().isBefore(date))
            || (job.getJobClosureDate().isBefore(date))
            )
            {
                System.out.println("Job posting date cant be before job closure date" +
                        "Job closure date cant be on or before today's date.");
                validJob = false;
            }

            if(job.getJobClosureDate().minusDays(15).isBefore(job.getJobPostingDate()))
            {
                System.out.println("Job should be posted for at least 15 days before cloure");
                validJob = false;
            }

        }
        else
        {
            validJob = false;
        }

        //Max salary can’t be lesser than or equal to min salary
        if(job.getMinSalary() != 0 && job.getMaxSalary() != 0)
        {
            if(job.getMaxSalary() <= job.getMinSalary())
            {
                System.out.println("Max salary can’t be lesser than or equal to min salary");
                validJob = false;
            }
        }
        else
        {
            validJob = false;
        }

        //job description can’t be null and it should be of at least 20 characters
        if(job.getJobDescription() != null)
        {
            if(job.getJobDescription().length() < 20)
            {
                System.out.println("Job description is too short");
                validJob = false;
            }
        }
        else
        {
            validJob = false;
        }

        return validJob;
    }
}
