package day_56_exceptions;

import java.util.List;
import java.util.*;

public class ExceptionExample {

    public static void main(String[] args) {
        System.out.println("Hello b15 students");

       // int num = 2.5; // compile error
        int [] nums = new int[3]; //0 1 2

        nums[0] = 55;
        nums[1] = 56;
        nums[2] = 100;
        //System.out.println("hello"); //until here the compiler works good no error


        //ArrayIndexOutOfBoundsException
        // nums[3] = 12; //there is a compiler error since array nums has only 3 empty boxes that filled with numbers;
/*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
	at day_56_exceptions.ExceptionExample.main(ExceptionExample.java:15)
*/

        System.out.println("the array nums takes only 3 numbers. array is not resizable.");
        //ArithmeticException
        int result = 10/0; // java saw that this line of code has mathematical issue
        /*Exception in thread "main" java.lang.ArithmeticException: / by zero
	at day_56_exceptions.ExceptionExample.main(ExceptionExample.java:22)*/ // this error is called >> STACK TRACE
        System.out.println("result = " + result);
       List<Integer> ints = new ArrayList<>();

    }
}
