package day_06_operators;
import java.util.Scanner;
public class Remainder {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = input.nextInt();
        System.out.println ("Enter another number: ");
        int num2 = input.nextInt();
        int result = num1/num2;
        int remainder = num1 % num2;
        System.out.println ("When " + num1 + " and " + num2 + " is divided, the result will be "
        + result + " - a whole number and " + remainder+ " is the remainder of it");

        //not always but in most cases.
        System.out.println(" If the remainder obtained from any division is added with an odd number, " +
                " the result will be an even number ");
        System.out.println("Lets check it, Enter an odd number: ");
        int oddNumber = input.nextInt();
        int evenNumber = oddNumber + remainder;
        System.out.println("The result is " + evenNumber + ". Is " +evenNumber + " an even number? "
                + " Yes " +evenNumber + " is an even number");
    }

}
