package day_06_operators;
import java.util.Scanner;
public class NextLine {
    public static void main (String [] args ) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your full name? ");
        String fullName = scan.nextLine(); // if next() were used instead nextLine() it would not stop
        //in line 11 below.
        System.out.println(fullName + " is coding with Java.");

        System.out.println("Enter address: ");
        //scan.nextLine();// this is used to make sure program stops in line 13.
        String address = scan.nextLine();
        System.out.println(fullName + " lives in " + address);



    }
}
