import com.test.app.*;

public class Main {
    public static void main(String[] args) {
        // Polymorphism - Overriding and Inheritance
        //PARENT:
        Customer customer = new Customer();
        customer.getDefaultPrivileges();

        //CHILD:
        GoldCustomer goldCustomer = new GoldCustomer();
        //Inherited properties
        goldCustomer.setAge(34);
        goldCustomer.setName("Chris");
        goldCustomer.setKycDone(false);
        goldCustomer.setCreditRating(344);
        goldCustomer.setInitialAccountBalance(10000);

        //own property
        goldCustomer.setCustomerPrivilege("Gold");
        goldCustomer.setCustomerType(CustomerType.GOLD.name()); //to get string, use .name()
        goldCustomer.getDefaultPrivileges(); //<--- call overriding method, call from our child class

        CustomerService customerService = new CustomerService();
        int flatCashback = customerService.calculateFlatCashback(CustomerType.GOLD);

        System.out.println("=== Gold Customer Details ===" +
        "\nPrivileges: " + goldCustomer.getCustomerPrivilege() +
        "\nName: " + goldCustomer.getName() +
        "\nInitial Account Balance: " + goldCustomer.getInitialAccountBalance() +
        "\nCustomer Type: " + goldCustomer.getCustomerType() +
                "\nFlat Cashback: " + flatCashback
        );
    }
}