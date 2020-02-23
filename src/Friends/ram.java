package Friends;
import java.util.*;
public class ram {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter ram size: ");
        int RAM = scan.nextInt();
        int priceRam = 0;
        for (int i = 4; i <= RAM; i += 4) {
            priceRam = priceRam + 50;

        }
        System.out.println(priceRam);
    }
}
