import com.test.app.Car;
import com.test.app.Customer;
import com.test.app.CustomerService;

public class Main {
    public static void main(String[] args) {
        // Polymorphism - Overloading
        Customer customer = new Customer(); // Creates a customer object whose fields are set

        customer.setAge(30);
        customer.setName("Deba");
        customer.setPhoneNumber(454545);
        customer.setKycDone(true);
        customer.setBankAccountType("Saving");
        customer.setAreaCode('W');
        customer.setCreditRating(800);

        // Initialize customer service so you can use its functions
        // this will show you 2 diff options for addPrivilege bc of overloading we did in CustomerService.java
        CustomerService customerService = new CustomerService();
//        customerService.addPrivilege(customer.getCreditRating());
        customerService.addPrivilege(customer.getCreditRating(), customer.isKycDone());

        Customer customer1 = new Customer();

        customer1.setAge(30);
        customer1.setName("Sam");
        customer1.setPhoneNumber(454545);
        customer1.setBankAccountType("Saving");
        customer1.setAreaCode('W');
        customer1.setCreditRating(700);
        customerService.addPrivilege(customer1.getCreditRating());

    }
}