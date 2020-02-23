package day_17_while_do_while_loop;
import java.util.Scanner; //instead of Scanner we can type * too. import java.util.*; is also possible
public class GiveMe5or10Dollars {
    public static void main(String[] args) {

        System.out.println("Give me 5 or 10 dollars");
        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();
        while (amount != 5 && amount != 10){
            System.out.println("Give me 5 or 10 dollars");
           amount = scan.nextInt();
        }
        System.out.println("Thank you for " + amount+ " dollars");
    }
}
