package replitExamples;
import java.util.Scanner;
public class MediumValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = scan.nextInt();
        System.out.println("Enter second number:");
        int num2 = scan.nextInt();
        System.out.println("Enter third number:");
        int num3 = scan.nextInt();
        if (num1>num2 && num1 <num3 ){
            System.out.println("Medium value is " + num1);
        }else if (num1>num3 && num1<num2){
            System.out.println("Medium value is " + num1);
        }else if(num2 >num1 && num2<3) {
            System.out.println("Medium value is " + num2);
        }else if (num2<num1 && num2>num3){
            System.out.println("Medium value is "+ num2);
        }else if (num3>num1 && num3<num2){
            System.out.println("Medium value is " +num3);

        }else if (num3>num2 && num3 <num1){
            System.out.println("Medium value is " +num3);

        }else if (num1==num2 || num1 ==num3 || num2==num3){
            System.out.println("The numbers are equal");
        }else {
            System.out.println("Invalid character");
        }
    }
}
