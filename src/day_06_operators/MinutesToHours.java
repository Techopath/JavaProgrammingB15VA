package day_06_operators;
import java.util.Scanner;
public class MinutesToHours {
    public static void main(String [] args) {

        int minutes = 135;
        int hours =  minutes / 60;
        int remainingMinutes = minutes%60;
        System.out.println("There are " + hours +" hours and " + remainingMinutes +" remaining minutes.");
    Scanner input = new Scanner(System.in);
    System.out.println("enter amount of hours: ");
    int M = input.nextInt();
    int R = M%60;
    System.out.println("There are " +M/60+ " hours and " + R+ " remaining minutes");


    }
}
