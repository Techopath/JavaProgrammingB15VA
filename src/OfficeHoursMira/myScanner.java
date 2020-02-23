package OfficeHoursMira;

import java.util.Scanner;
public class myScanner {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two odd numbers: ");
        String number1 = input.next();
        String number2 = input.next();
        System.out.println("The sum of two odd numbers is an even number: " +(number1+number2));


    }
}
