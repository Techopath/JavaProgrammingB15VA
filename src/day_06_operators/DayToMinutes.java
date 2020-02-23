package day_06_operators;
import java.util.Scanner;
public class DayToMinutes {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of days you want to convert in minutes: ");
        int day = input.nextInt();
        // minutes = Day*24 hours * 60 minutes;
        int minutes = day * 24*60;
        System.out.println("There are " + minutes + " minutes in " + day +" day/days");
        ////
        System.out.println("Enter the number of years you want to find the number of days/weeks/months in it: ");
        int years = input.nextInt();
        int Days = years * 365;
        int Weeks = years * 12 * 4;
        int Months = years * 12;
        int hours = years * Days * 24 * 60 ;
        int seconds = hours * 60;
        System.out.println("There are " + Days + " days, \n" + Weeks + " weeks, \n" +Months+ " months, \n"
                + hours + " hours \nand " + seconds + " seconds in " +years + " years");
    }
}
