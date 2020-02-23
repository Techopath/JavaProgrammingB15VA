package replitExamples;
import java.util.Scanner;
public class VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price in cents: ");
        int itemPrice = scan.nextInt();
        int machineAccepts = 100; //in cents
        //price range starts from 25 cents contines with 5 increment upto 100 cents. prices less than 25 or more than 100 are invalid prices
        int change = machineAccepts - itemPrice;

        if (itemPrice >=25 && itemPrice<=100 && itemPrice%5 == 0 ){
            int quarters = change/25;
            int dimes = (change - quarters*25)/ 10;
            int nickels =(change-quarters*25-dimes*10)/5;
            System.out.println("Your change is " +quarters +" quarters, " + dimes +" dimes, and " +nickels + " nickels");



        }
        else {
            System.out.println("Invalid Price!");
        }
    }

}
