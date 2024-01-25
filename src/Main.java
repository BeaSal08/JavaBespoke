import com.test.app.Car;
import com.test.app.Customer;
import com.test.app.CustomerService;

public class Main {
    public static void main(String[] args) {
//        // Instantiate a class to make an object
//        Customer customer = new Customer(); // uses the default constructor bc we havent created a constructor in the customer class
//
//        // Set values of different fields of the customer
//        customer.setAge(30);
//        customer.setName("Deba");
//        customer.setPhoneNumber(454545);
//        customer.setKycDone(false);
//        customer.setAreaCode('W');
//
//        System.out.println("==== Customer Details ====" +
//                "\nAge: " + customer.getAge() +
//                "\nphoneNumber: " + customer.getPhoneNumber() +
//                        "\nisKycDone: " + customer.isKycDone() +
//                        "\nareaCode: " + customer.getAreaCode()
//                );
//
//        // Create another obj (has no relation to 1st customer)
//        Customer customer1 = new Customer();
//
//        customer1.setAge(40);
//        customer1.setName("Sam");
//        customer1.setPhoneNumber(636363);
//        customer1.setKycDone(true);
//        customer1.setAreaCode('A');
//
//        System.out.println("==== Customer Details ====" +
//                "\nAge: " + customer1.getAge() +
//                "\nphoneNumber: " + customer1.getPhoneNumber() +
//                "\nisKycDone: " + customer1.isKycDone() +
//                "\nareaCode: " + customer1.getAreaCode()
//        );
//
//        // Constructors:
//        Car car = new Car("Mini Cooper", 1999);
//        System.out.println("==== Car Details ====" +
//                "\nAge: " + car.getName() +
//                "\nphoneNumber: " + car.getYearOfMake()
//        );
//
//        car.setName("Honda");
//        car.setYearOfMake(2003);
//
//        System.out.println("==== Updated Car Details ====" +
//                "\nAge: " + car.getName() +
//                "\nphoneNumber: " + car.getYearOfMake()
//        );

        // Polymorphism - Overloading
        Customer customer = new Customer(); // Creates a customer object whose fields are set

        customer.setAge(30);
        customer.setName("Deba");
        customer.setPhoneNumber(454545);
        customer.setKycDone(true);
        customer.setBankAccountType("Saving");
        customer.setAreaCode('W');
        customer.setCreditRating(800);

        // Initialize customer service so you can use it's functions
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