package day_06_operators;
import java.util.Scanner;
public class CentsToDollars {
    public static void main (String [] args) {
        int cents = 144;
        int dollars = cents / 100;
        int remainingCents = cents % 100;
        System.out.println (dollars +" dollars and " + remainingCents +" cents");

        ///use Scanner function ...
        Scanner input = new Scanner(System.in);
        System.out.println("How many cents you have in total: ");
        int Cents = input.nextInt();
        int Dollars = Cents / 100;
        int Remaining = Cents % 100;
        System.out.println(" So, you have " +Dollars +" dollars and " + Remaining + "cents ");

    }
}
