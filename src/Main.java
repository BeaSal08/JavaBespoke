import com.test.app.Customer;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();

        System.out.println("age = " + customer.getAge());
        System.out.println("phoneNumber = " + customer.getPhoneNumber());
        System.out.println("isKycDone = " + customer.isKycDone());
        System.out.println("areaCode = " + customer.getAreaCode());
    }
}