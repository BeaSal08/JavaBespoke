import com.test.app.*;
import com.training.company.EmployerService;
import com.training.company.EmploymentService;
import com.training.company.TypeOfEmployee;
import com.training.java.Employee;
import com.training.java.Salary;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Main {
//    public static void main(String[] args) throws ParseException {
public static void main(String[] args) {
        // Date operations
        // Parse API
//        String dob = "1995-12-12"; //should be in format of ISO_LOCAL_DATE or ISO_LOCAL_DATE_TIME for it to be parseable
//        LocalDate dobConverted = LocalDate.parse(dob);
//        System.out.println("dobConverted = " + dobConverted); //this is now a localDate
//        LocalDate today = LocalDate.now();
//
//        // checks if dob is at least 18 years old by today's date, if true di ka pa 18 and cannot register
//        if (dobConverted.plusYears(18).isAfter(today))
//        {
//            System.out.println("You are not 18 yet");
//        }
//        else
//        {
//            System.out.println("You are registered successfully!");
//        }
//
//        // Simple Date Format
//        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
//
//        String weddingDate = "10-Apr-2019";
////        Date date = sdf.parse(weddingDate); //throws parse exception
//
//        // if ayoko i-"throws ParseException" I can use try-catch to handle it
//        Date date = null;
//        try {
//            date = sdf.parse(weddingDate);
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println("Parsed weddingDate = " + date); //result: Wed Apr 10 00:00:00 SGT 2019

        //Exceptions
//        ExceptionExamples exceptionExamples = new ExceptionExamples();
//        exceptionExamples.checkNumberFormatException();

        LoanUtilService loanUtilService = new LoanUtilService();
        loanUtilService.calculateInterestRates("STUDENT"); //throws no error, displays nothing when valid
    }
}