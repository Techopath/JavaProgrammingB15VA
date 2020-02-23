package day_04_math_operators_scanner;

public class MathOperations {
    public static void main(String [] args){
        int i = 20;
        int j = 7;
        System.out.println("Addition: " +(i+j));
        System.out.println("Subtraction: "+ (i-j));
        System.out.println("Multiplication: " + i*j);
        System.out.println("Division: " +i/j); //doesnt show the reminder in this case.

        //the number of chairs
        int chairs = 100 + 5;
        System.out.println("Chair's number: " +chairs);

        int tables = chairs - 10;
        System.out.println("Tables: " + tables);
        double k= i%j; //gives the reminder
        System.out.println("\n"+"When 10 is divided by 3 \nThe answer is " + i/j +"\nthe reminder is "+k);
    }
}
