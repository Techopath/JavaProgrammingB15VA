package day_12_ternary_string_manipulation;
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to see whether it is divisible by 5 and 3");
        int number = scan.nextInt();
        if (number%5 ==0 && number % 3 == 0){
            System.out.println(number + " is fizzbuzz // It is divisible both by 5 and 3");
        }else if (number%3 == 0 ){
            System.out.println(number +" is fizz // It is divisible only by 3");
        }else {
            System.out.println(number + " is buzz // it is divisible only by 5");
        }
    }


}
