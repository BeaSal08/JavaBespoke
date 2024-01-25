import com.test.app.Car;
import com.test.app.Customer;
import com.test.app.CustomerService;

public class Main {
    public static void main(String[] args) {
//        // Wrapper Class converting primitive to wrapper class
//        // why? bc yearOfBirth is int and not Integer so it doesnt have extra functions like .equals()
//        int yearOfBirth = 2000;
//        Integer yob = yearOfBirth;
//        System.out.println("yob == 2000 ? : " +  yob.equals(2000));
//
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

//        // Operators in Java
//        int x = 5;
//        int z = 6;
//        boolean y = false;
//
//        System.out.println("==== Arithmetic Operators ====" +
//                "\nx: " + x + "\ny: " + y
//        );
//
//        System.out.println("post increment x: " + x++);
//        System.out.println("pre increment x: " + ++x);
//
//        System.out.println("post decrement x: " + x--);
//        System.out.println("pre decrement x: " + --x);
//
//        System.out.println("not y: " + !y);
//
//        // Bitwise and Shift operators use bits
//        System.out.println("==== Bitwise Operators ====" +
//                "\nx (5): 0000 0101" + "\nz (6): 0000 0110"
//        );
//        System.out.println(x & z); //AND, results to 4 bc 0000 0100
//        System.out.println(x | z); //OR, results to 7 bc 0000 0111 (hindi sya addition na OR)
//
//        // Assignment Operators
//        z += 10;
//        System.out.println("==== Assignment Operators ====" +
//                "\nz (before assign) = 6" + "\nz (aft assign): " + z
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