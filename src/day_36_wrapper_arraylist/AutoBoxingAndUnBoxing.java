package day_36_wrapper_arraylist;

import java.util.Arrays;

public class AutoBoxingAndUnBoxing {
    public static void main(String[] args) {

        //AutoBoxing: primitive to wrapper class object

        Integer n1 = 1000;
        int n = 345;
        Integer n2 =n;

        //UNBOXING : WRAPPER CLASS OBJECT TO PRIMITIVE

        Integer n3 = Integer.valueOf(4567);
        int num1 =n3;

        //print values

        System.out.println("n1 = " + n1);
        System.out.println("n = " + n);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);
        System.out.println("num1 = " + num1);


    }
}
