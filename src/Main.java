import com.test.app.Car;
import com.test.app.Customer;
import com.test.app.CustomerService;
import com.test.app.GoldCustomer;

public class Main {
    public static void main(String[] args) {
        // Polymorphism - Overriding and Inheritance
        GoldCustomer goldCustomer = new GoldCustomer();
        //Inherited properties
        goldCustomer.setAge(34);
        goldCustomer.setName("Chris");
        goldCustomer.setKycDone(false);
        goldCustomer.setCreditRating(344);
        //own property
        goldCustomer.setCustomerPrivilege("Gold");

        System.out.println("=== Gold Customer Details ===" +
                "\nPrivileges: " + goldCustomer.getCustomerPrivilege() +
                "\nName: " + goldCustomer.getName());
    }
}