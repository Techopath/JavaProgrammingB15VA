package MyWrittenCodes;
import java.util.Scanner;
public class EatOrNot_Scanner {
    public static void main(String[] args) {

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Are you hungary? if yes type 1 otherwise type 0");
            int answer = scan.nextInt();
            if (answer == 1) {
                System.out.println("Go and eat lamb kebab!");
                System.out.println("Do you want me to offer you a place to go?");
                int answer1 = scan.nextInt();
                if (answer1 == 1) {
                    System.out.println("You have two offers from us. \n To proceed type 1. to stop type 0");
                    int answer2 = 1;
                    if (answer2 == 1) {
                        System.out.println("You can go to McDonalds or Burger King");
                        return;
                    } else {
                        System.out.println("You can go home!");
                    }


                }
                if (answer < 0 | answer > 1) {
                    System.out.println("You gave a wrong answer!!! Type either 1 or 0");
                } else if (answer == 0) {
                    System.out.println("You are not hungary. Maybe you want something to drink?");
                    System.out.println("if you want to drink, type 1 otherwise type 0");
                    int answer3 = scan.nextInt();
                    if (answer3 == 1) {
                        System.out.println("You can go to Robeks to drink some smoothies");
                    } else {
                        System.out.println("Go home and relax");
                    }
                }
            }
        }
    }
}