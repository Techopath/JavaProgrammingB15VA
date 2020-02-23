package day_05_practice_scanner_math;
import java.util.Scanner;
public class ScannerSpeedCheck {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in); //Create Scanner object
        System.out.println("Welcome to speed Check Program!");
        System.out.println("Enter your current speed");
        int currentSpeed = input.nextInt();
        System.out.println("current speed: " + currentSpeed);
        System.out.println("What ise the posted speed limit in this road? ");
        int speedLimit = input.nextInt();
        int overTheLimit = currentSpeed - speedLimit;
        System.out.println("the posted limit: " + speedLimit );
        System.out.println("you are driving " + overTheLimit + " mph over the posted limit" +
                " Be careful and slow down");

    }
}
