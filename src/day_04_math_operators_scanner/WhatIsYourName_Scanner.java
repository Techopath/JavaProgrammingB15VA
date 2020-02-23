package day_04_math_operators_scanner;

import java.util.Scanner;
public class WhatIsYourName_Scanner {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.next();
        //String name = "Adam";
        //System.out.println("Nice to meet you, " + name);

        System.out.println("Nice to meet you, " + name);
        //Scanner input = new Scanner(System.in);
        System.out.println("What is your  last name?");
        String lastName = input.next();
        //Scanner input = input.next();
        System.out.println("good " +name +" " +lastName);


    }
}
