import com.test.app.*;
import com.training.company.EmployerService;
import com.training.company.EmploymentService;
import com.training.company.TypeOfEmployee;
import com.training.java.Employee;
import com.training.java.Salary;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        CustomerService customerService = new CustomerService();
//        ArrayList<Customer> customers = customerService.createCustomerList();
//        customerService.openBankAccount(customers);

        String s1 = "Hello World";
        String s2 = "Goodbye World";

        System.out.println("=== String Methods ===");
        // Concatination
        String s3 = s1.concat(s2) ;
        String s4 = s1 + s2;
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);

    }
}