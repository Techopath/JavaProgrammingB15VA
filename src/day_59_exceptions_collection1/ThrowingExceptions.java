package day_59_exceptions_collection1;
import java.io.IOException;
import java.util.*;

public class ThrowingExceptions {

    public static void main(String[] args) {
        //create object of Arithmetic exception

        ArithmeticException ar = new ArithmeticException();
        RuntimeException ar2 = new ArithmeticException("cannot / by 0");

        System.out.println(ar.getMessage());
        System.out.println(ar2.getMessage());

        //System.out.println(9/2);
        //throw ar;
        //System.out.println("java");

        String userName = "user12";

        if(userName.isEmpty()) {

            RuntimeException r = new RuntimeException("username cannot be empty");
            throw r;

            //throw new RuntimeException("user name cannot be empty");
        }else{
            System.out.println("username is valid");
        }

        int age = 20;
        if(age>18){
            System.out.println("Eligible to vote");

        }else{
            throw new IllegalArgumentException("ineligible to vote");
        }

        int month = 1;
        if(month >=1 && month<=12){
            System.out.println("Valid month - "+month);
        }else{
            throw new RuntimeException("Invalid month - "+month);
        }

        int [] nums = {44, 55, 11};
        int index = 1;

        if(index <0 || index>= nums.length){
            throw new ArrayIndexOutOfBoundsException("invalid index - "+index);
        }else{
            System.out.println("index "+ index+", value "+nums[index]);
        }

        String firstName = "Nadir";

        if(firstName == null){
            throw new NullPointerException("FirstName cannot be null");
        }
        for (int i = 0; i < firstName.length(); i++) {
            System.out.println(firstName.charAt(i));
        }

        //call method
        System.out.println(getWeekDayName(7));
        try {
            System.out.println(getWeekDayName(8));
        }catch (IllegalArgumentException e){
            System.out.println("IllegalArgumentException was handled");
            System.out.println(e.getMessage());
            System.out.println(getWeekDayName(1));

        }

        try{
            throw new IOException();

        }catch (Exception e){
            System.out.println("Exception is caught");
            System.out.println(e.getMessage());
        }
    }
    //custom method
    public static String getWeekDayName(int day){
        if(day<1 || day >7){
            throw new IllegalArgumentException("Invalid day : "+day);
        }
        String dayName = "";
        switch (day){
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tueday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
        }
        return dayName;
    }

}
