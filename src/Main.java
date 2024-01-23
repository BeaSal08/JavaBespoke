import com.test.app.Customer;

public class Main {
    public static void main(String[] args) {
        // Instantiate a class to make an object
        Customer customer = new Customer();

        customer.setAge(30);
        customer.setName("Deba");
        customer.setPhoneNumber(454545);
        customer.setKycDone(false);
        customer.setAreaCode('W');

        System.out.println("age = " + customer.getAge());
        System.out.println("phoneNumber = " + customer.getPhoneNumber());
        System.out.println("isKycDone = " + customer.isKycDone());
        System.out.println("areaCode = " + customer.getAreaCode());
    }
}