package day_17_while_do_while_loop;
import java.util.Scanner;
public class GiveMe5Dollars {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    //System.out.println("Give me 5 dollars");
    int amount = 0;//scan.nextInt();
    while (amount != 5) {
        System.out.println("Give me 5 dollars");
        amount = scan.nextInt();
    }
        System.out.println("thank you for 5 dollars");






    }
}
