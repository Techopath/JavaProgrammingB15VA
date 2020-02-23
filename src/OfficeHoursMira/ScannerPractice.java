package OfficeHoursMira;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your favorite city: ");
        String city = scan.next();
        System.out.println("My favorite city is: " + city);
        System.out.println("Please enter your favorite country: ");
        String country = scan.next();
        System.out.println("My favorite country is: " + country);
        System.out.println("Enter 2 numbers: ");
        String number1 = scan.next();
        String number2 = scan.next();
        System.out.println(number1 +" "+ number2);
        //to rename variable -> right click on name -> refactor -> rename
        //it will change the name of variable in the whole file
        //print: I love "Java"
        System.out.println("I love \"Java\"");
        System.out.println("ignore char \\");
    }
}
