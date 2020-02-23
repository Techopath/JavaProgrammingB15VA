package day_06_operators;
import java.util.Scanner;
public class TempConverter {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Fahrenheit value: ");
        double fahrenheit = input.nextDouble();
        // C = (F - 32)*5/9
        double celsius = (fahrenheit - 32)*5/9;
        // 58 F is 7.22 in Celsius
        System.out.println(fahrenheit + " is " + celsius + " in Celsius");
         // F = 9/5C + 32;
        System.out.println("What about conversion of celsius into fahrenheit?");
        System.out.println("enter celsius value: ");
        double celsius2 = input.nextDouble();
        double fahrenheit2 = (celsius2*9/5) + 32;
        System.out.println(celsius2 + " 0C is " + fahrenheit2 +" in Fahrenheit ");
    }
}
