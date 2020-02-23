package day_05_practice_scanner_math;
import java.util.Scanner;
public class AddNumbers {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int sum = n1+n2;
        System.out.println("the sum of the above numbers is " + sum);
        /*int a = 5;
        int b = 3;
        int c = a + b ;
        System.out.println("the sum is " + c);
*/
    }
}
