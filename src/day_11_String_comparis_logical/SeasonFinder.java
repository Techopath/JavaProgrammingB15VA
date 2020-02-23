package day_11_String_comparis_logical;
import java.util.Scanner;
public class SeasonFinder {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the month in digits:");
            int month = scan.nextInt();
            if (month == 12 || month == 1 || month == 2) {
                System.out.println("It is winter");
            } else if (month == 3 || month == 4 || month == 5) {
                System.out.println("It is Spring");
            } else if (month == 6 || month == 7 || month == 8) {
                System.out.println("It is Summer");
            } else if (month == 9 || month == 10 || month == 11){
                System.out.println("It is Fall");
            }else
                System.out.println("There is no such a month!");
        }
    }
}
