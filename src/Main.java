import com.test.app.Car;
import com.test.app.Customer;

public class Main {
    public static void main(String[] args) {
//        // Wrapper Class converting primitive to wrapper class
//        // why? bc yearOfBirth is int and not Integer so it doesnt have extra functions like .equals()
//        int yearOfBirth = 2000;
//        Integer yob = yearOfBirth;
//        System.out.println("yob == 2000 ? : " +  yob.equals(2000));
//
//        // Instantiate a class to make an object
//        Customer customer = new Customer(); // uses the default constructor bc we havent created a constucor in the customer class
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

        // Operators in Java
        int x = 5;
        boolean y = true;

        System.out.println("==== Arithmetic Operators ====" +
                "\nx: " + x + "\ny: " + y
        );

        System.out.println("post increment x: " + x++);
        System.out.println("pre increment x: " + ++x);

        System.out.println("post decrement x: " + x--);
        System.out.println("pre decrement x: " + --x);

        System.out.println("not y: " + !y);

        // results to original values bc arithmetic operators don't save changes values
        System.out.println("==== Updated Arithmetic Operators ====" +
                "\nx: " + x + "\ny: " + y
        );
    }
}