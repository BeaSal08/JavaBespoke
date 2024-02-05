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
    public static void main(String[] args) throws ParseException {
//        String s1 = "Hello World";
//        String s2 = "Goodbye World";
//
//        System.out.println("=== String Methods ===");
//        // Concatination
//        String s3 = s1.concat(s2) ;
//        String s4 = s1 + s2;
//        System.out.println("s3 = " + s3);
//        System.out.println("s4 = " + s4);
//
//        //Substring - gets part of a string
//        String ss1 = s1.substring(6);
//        System.out.println("Substring at index 6 = " + ss1);
//
//        String ss2 = s2.substring(8);
//        System.out.println("is ss1 equal to ss2? " + ss1.equals(ss2));
//
//        if (s1.contains("Hel"))
//        {
//            System.out.println("Contains the char sequence");
//        }
//
//        //Splitting, note: limit is optional
//        String str = "geekss@for@geekss";
//        String[] arrOfStr = str.split("@", 2); // pag 3, 3 times nya isplisplit based on "@"
//
//        for (String a : arrOfStr)
//            System.out.println(a);
//
//        String str2 = "014-222-1989";
//        String[] arrOfStr2 = str2.split("-", 4); // pag sobra, basta kung ilan lang
//
//        for (String a : arrOfStr2)
//            System.out.println(a);
//
//        System.out.println("The last 4 digits are: " + arrOfStr2[2]);

        // Date operations
        // Parse API
        String dob = "1995-12-12"; //should be in format of ISO_LOCAL_DATE or ISO_LOCAL_DATE_TIME for it to be parseable
        LocalDate dobConverted = LocalDate.parse(dob);
        System.out.println("dobConverted = " + dobConverted); //this is now a localDate
        LocalDate today = LocalDate.now();

        // checks if dob is at least 18 years old by today's date, if true di ka pa 18 and cannot register
        if (dobConverted.plusYears(18).isAfter(today))
        {
            System.out.println("You are not 18 yet");
        }
        else
        {
            System.out.println("You are registered successfully!");
        }

        // Simple Date Format
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");

        String weddingDate = "10-Apr-2019";
        Date date = sdf.parse(weddingDate);

        System.out.println("Parsed weddingDate = " + date); //result: Wed Apr 10 00:00:00 SGT 2019



    }
}