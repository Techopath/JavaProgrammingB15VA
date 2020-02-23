package replitExamples;
import java.util.*;
public class OnlineBookMerchants_87 {
    public static void main(String[] args) {
        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        boolean isPremiumCustomer = scan.nextBoolean();
        int nbooksPurchased = scan.nextInt();

        if (isPremiumCustomer == true) {
            for (int i = 5; i <= nbooksPurchased; i += 5) {
                freeBooks = freeBooks + 1;
            }

        } else if (isPremiumCustomer == true) {
            for (int i = 8; i <= nbooksPurchased; i += 8) {
                freeBooks = freeBooks + 2;
            }

        }
        System.out.println(freeBooks);


    }
}