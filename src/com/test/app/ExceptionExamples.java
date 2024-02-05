package com.test.app;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptionExamples {

    public void checkArithmeticException() {
//        try {
//            int a = 100 / 0; //not possible
//        } catch(ArithmeticException e)
//        {
//            System.out.println("Exception Message: " + e);
//
//        }

        int a = 100 / 0;
    }

    //Only one catch block gets executed
    public void checkArrayIndexOOBException() {
        try {
            int a[] = {1,2,3};
            System.out.println(a[4]);
            a[4] = 40/0;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception occurred "+e);

        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurred");
        }

        finally
        {
            System.out.println("finally block");
        }
    }

    public void checkFileNotFoundException() {
        PrintWriter pw;
        try {
            pw = new PrintWriter("abc.txt");
        } catch(FileNotFoundException e)
        {
            System.out.println("Exception occured "+e);

        }
    }

    public void checkNumberFormatException() {

        try {
            String s = "abc";
            int a = Integer.parseInt(s);
        } catch(NumberFormatException e)
        {
            System.out.println("Exception occured "+e);

        }
    }


}