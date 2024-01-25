import com.test.app.*;
import com.training.company.EmployerService;
import com.training.company.EmploymentService;
import com.training.company.TypeOfEmployee;
import com.training.java.Employee;
import com.training.java.Salary;

public class Main {
    public static void main(String[] args) {
//        Customer customer = new Customer();
//        customer.setName("Deba");
//        customer.setAge(31);
//        customer.setCreditRating(800);
//        customer.setBankAccountType("Saving");
//
//        Loan loan = new Loan();
//        loan.setLoanAmount(20000);
//        loan.setLoanTypes(LoanTypes.HOME);
//        customer.setLoan(loan);
//
//        HomeLoanService homeLoanService = new HomeLoanService();
//        homeLoanService.applyLoan(customer);

        Employee employee = new Employee();
        EmployerService employerService = new EmployerService();
        Salary salary = employerService.calculateSalary(500, 500);
        employee.setSalary(salary);
        employee.setName("Sara");
        employee.setExperienceInYears(6);
        employee.setTypeOfEmployee(TypeOfEmployee.PEOPLEPERSON);

        EmploymentService employmentService = new EmploymentService();
        employmentService.attendTraining(employee);
        employmentService.signEmploymentDocuments(employee);
        employmentService.receiveLaptop(employee.getTypeOfEmployee());
    }
}