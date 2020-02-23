package day_35_wrapper_classes;

import java.util.Arrays;

public class MethodsWithArrayReturn {
    public static void main(String[] args) {

        System.out.println(getDays()); //prints out hash codes
        System.out.println(Arrays.toString(getDays()));
        System.out.println();

        String [] daysArray = getDays();
        System.out.println(Arrays.toString(daysArray));

        for (String day : getDays()){
            System.out.println(day);
        }
    }
    public static String [] getDays (){
        String [] days = {"Mon", "Tues", "Wed", "Thur", "Fri", "Sat", "Sun"};

        return days;
    }
}
