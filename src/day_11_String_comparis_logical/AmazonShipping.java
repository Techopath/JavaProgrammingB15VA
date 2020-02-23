package day_11_String_comparis_logical;
import java.util.Scanner;
public class AmazonShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Amazon Shipping!");
        System.out.println("Are you a prime member?");
        boolean isPrimeMember = scan.nextBoolean();
        System.out.println("What is your total order amount in dollars:");
        double totalOrderPrice = scan.nextDouble();
        if (isPrimeMember == true || totalOrderPrice >=25.0){
            System.out.println("You are eligible for free shipping");

        }else if (!isPrimeMember || totalOrderPrice <= 25.0){
            System.out.println("You are not prime member and your order is less than 25.0. You dont qualify for free shipping" );
           // System.out.println("You don't qualify for free shipping with " + totalOrderPrice + "Your order needs to be over $25.0");
        }

    }
}
