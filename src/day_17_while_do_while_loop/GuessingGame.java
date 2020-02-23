package day_17_while_do_while_loop;
import java.util.Random;
import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(10);//int secretNumber = 10;
        int guessingNumber =0;
      //  System.out.println("Guess the secret number: ");
        do {
            System.out.println("Guess the secret number: ");
            guessingNumber = scan.nextInt();
            if (guessingNumber > secretNumber){
                System.out.println("wrong, your number is large");
            }else if(guessingNumber <secretNumber){
                System.out.println("wrong. your number is small");

            }
        } while (guessingNumber != secretNumber);
        System.out.println("Congratulations! you guessed correctly.");

    }
}
