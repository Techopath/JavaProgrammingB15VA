package MyWrittenCodes;
import javax.swing.*;
import java.util.Scanner;
public class IfStatement_Scanner {
    public static void main (String [] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Type any random number between 4 and 11: ");
        int randomNumber = userinput.nextInt();
        if (randomNumber == 5) {
            System.out.println("You are a good fit to learn java");
        } else if (randomNumber >= 10) {
            System.out.println("You have to learn Java");
        } else if (randomNumber >5 | randomNumber <=9) {
            System.out.println("Java is not your choice");
                    }
        else {
            System.out.println("You have a potential to learn java");

        }

    }
}
