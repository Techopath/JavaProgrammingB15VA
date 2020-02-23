package replitExamples;
import java.util.Scanner;
public class GiftCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("input: ");
        String item = scan.nextLine();

        //WRITE YOUR CODE HERE
        double price = scan.nextDouble();


        double giftCardLimit = 100.0;

        double balance = giftCardLimit - price;
        if (item.equalsIgnoreCase("Smartphone") ){
            if (price < giftCardLimit) {
                System.out.println("Thanks for your purchase! \nYour balance is " + balance);
            } else {
                System.out.println("Sorry, your fund is not sufficient");
            }

        } else if (item.equalsIgnoreCase("Laptop")) {
            if (price < giftCardLimit) {
                System.out.println("Thanks fot your purchase! \nYour balance is " + balance);
            } else {
                System.out.println("Sorry, your fund is not sufficient");
            }
        }else if (item.equalsIgnoreCase("Charger") ) {
                if (price < giftCardLimit) {
                    System.out.println("Thanks fot your purchase! \nYour balance is " + balance);
                } else {
                    System.out.println("Sorry, your fund is not sufficient");
                }
        }else if (item.equalsIgnoreCase("usb cable") ) {
            if (price < giftCardLimit) {
                System.out.println("Thanks fot your purchase! \nYour remaining balance is " + balance);
            } else {
                System.out.println("Sorry, your fund is not sufficient");
            }
        } else {
            System.out.println("Invalid Item");
        }

    }
}
