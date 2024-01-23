import com.test.app.Customer;

public class Main {
    public static void main(String[] args) {
        // Wrapper Class converting primitive to wrapper class
        // why? bc yearOfBirth is int and not Integer so it doesnt have extra functions like .equals()
        int yearOfBirth = 2000;
        Integer y = yearOfBirth;
        System.out.println("y == 2000 ? : " +  y.equals(2000));

        // Instantiate a class to make an object
        Customer customer = new Customer(); // uses the default constructor bc we havent created a constucor in the customer class

        // Set values of different fields of the customer
        customer.setAge(30);
        customer.setName("Deba");
        customer.setPhoneNumber(454545);
        customer.setKycDone(false);
        customer.setAreaCode('W');

        System.out.println("==== Customer Details ====" +
                "\nAge: " + customer.getAge() +
                "\nphoneNumber: " + customer.getPhoneNumber() +
                        "\nisKycDone: " + customer.isKycDone() +
                        "\nareaCode: " + customer.getAreaCode()
                );

        // Create another obj (has no relation to 1st customer)
        Customer customer1 = new Customer();

        customer1.setAge(40);
        customer1.setName("Sam");
        customer1.setPhoneNumber(636363);
        customer1.setKycDone(true);
        customer1.setAreaCode('A');

        System.out.println("==== Customer Details ====" +
                "\nAge: " + customer1.getAge() +
                "\nphoneNumber: " + customer1.getPhoneNumber() +
                "\nisKycDone: " + customer1.isKycDone() +
                "\nareaCode: " + customer1.getAreaCode()
        );

    }
}