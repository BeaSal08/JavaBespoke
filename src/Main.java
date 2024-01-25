import com.test.app.*;
import com.training.company.EmployerService;
import com.training.company.EmploymentService;
import com.training.company.TypeOfEmployee;
import com.training.java.Employee;
import com.training.java.Salary;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        ArrayList<Customer> customers = customerService.createCustomerList();
        customerService.openBankAccount(customers);

    }
}