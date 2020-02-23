package day_05_practice_scanner_math;
import java.util.Scanner;
public class GroceryShopping {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("welcome to harris teeter!");
        System.out.println("How much is the potatoes? ");
        double p = scan.nextDouble();
        System.out.println("How much is the domatoes? ");
        double d = scan.nextDouble();
        System.out.println("how much is eggplants? ");
        double e = scan.nextDouble();
        double total_purchase = p+d+e;
        System.out.println("The total purchase cost is " + total_purchase);
        System.out.println("Dear customer! Thanks for your purchase! See you soon again!");
    }
}
