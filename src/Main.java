import com.test.app.*;

public class Main {
    public static void main(String[] args) {
//        Customer customer = new Customer();
//        customer.setName("Deba");
//        customer.setAge(31);
//        customer.setCreditRating(800);
//        customer.setBankAccountType("Saving");
//
//        Loan loan = new Loan();
//        loan.setLoanAmount(20000);
//        loan.setLoanTypes(LoanTypes.HOME);
//        customer.setLoan(loan);
//
//        HomeLoanService homeLoanService = new HomeLoanService();
//        homeLoanService.applyLoan(customer);

        //FOR LOOPS
        String customers[] = {"Deba", "Sam", "Yasmin"};

        for (int i = 0; i < customers.length; i++)
        {
            System.out.println("Customer applied for loan: " + customers[i]);
        }
    }
}