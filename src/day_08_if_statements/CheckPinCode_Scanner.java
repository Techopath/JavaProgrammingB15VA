package day_08_if_statements;
import java.util.Scanner;
public class CheckPinCode_Scanner {
    public static void main(String [] args ) {
        int secretCode = 2345;
        while (true) { //reruns the program automatically
            Scanner scan = new Scanner(System.in);
            System.out.println("Welcome to Bank of America ATM! \n Insert your card and Enter your 4 digit pin code");

            int inputPinCode = scan.nextInt();
            if (inputPinCode == secretCode) {
                System.out.println("Welcome to your account Muhammad! \nYou can start to deposit, withdraw and many more");
                System.out.println("Live long!");
                return;//if the pin code is correct the program stops there.
            } else {
                System.out.println("Access denied, wrong pin code! \n Left 2 more tries");
            }
            System.out.println("Live long!");
        }


    }

}

