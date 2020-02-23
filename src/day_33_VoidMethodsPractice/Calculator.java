package day_33_VoidMethodsPractice;

import org.w3c.dom.ls.LSOutput;

public class Calculator {
    public static void main(String[] args) {

        addNums(1,5);

        //int sum = addNums(10,4); //Error when void is used
        int sum = addNumbers(5,4);
        System.out.println("sum from method "+sum);
        //aslo
        System.out.println("result is "+addNumbers(44,22));

        //call subtraction method
        int sub = subtraction(99,999);
        System.out.println("Subtraction is "+sub);
                                        //-900 will be returned to here
        System.out.println("99-999 is "+subtraction(99,999));

    }
    // subtraction method
    public static int subtraction (int num1, int num2){
        int result = num1 - num2;
        return result;
    }
    // addNumbers method
    public static int addNumbers (int num1, int num2){
        int result = num1+num2;
        //System.out.println(result+" wow"); //we can use print out before return
        return  result; //this result will be returned to addNumbers above and the summation will be stored in sum.

    }


    public static void addNums (int num1, int num2){
        int result = num1+num2;
        System.out.println("result is "+result);
    }
}
