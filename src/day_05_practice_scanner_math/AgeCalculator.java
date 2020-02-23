package day_05_practice_scanner_math;
import java.util.Scanner;
public class AgeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your first name? ");
        String name = input.next();
        System.out.println("What is your date of birth, " + name + "?");
        int yearOfBirth = input.nextInt();
        System.out.println("What is your month of birth? ");
        int monthOfBirth = input.nextInt();
        System.out.println("What is your day of birth? ");
        int dayOfBirth = input.nextInt();
        System.out.println("what is the current year? ");
        int currentYear = input.nextInt();
        System.out.println("what is the current month? ");
        int currentMonth = input.nextInt();
        System.out.println("what is the current day? ");
        int currentDay = input.nextInt();

        int age = currentYear - yearOfBirth;
        int monthYouAreIn = currentMonth - monthOfBirth;
        int dayYouAreIn = currentDay - dayOfBirth;
        System.out.println("You are " + age  +" years" +monthYouAreIn +" month and " +dayYouAreIn +" old " + name);
    }
}

    /*String name = "Adam Smith";
    int yearOfBirth = 1970;
    int currentYear = 2019;
    int age = currentYear - yearOfBirth;
    System.out.println("You are " + age + " years old");
*/
