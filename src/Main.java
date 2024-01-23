import com.test.app.Customer;

public class Main {
    public static void main(String[] args) {
        // Instantiate a class to make an object
        Customer customer = new Customer();

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
    }
}