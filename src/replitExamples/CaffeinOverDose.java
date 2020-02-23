package replitExamples;
import java.util.Scanner;
public class CaffeinOverDose {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of milligrams in drink:");
        int caffeineAmount = scan.nextInt();
        double overDoseAmount = 10000;
        double numberOfDrinks = overDoseAmount / caffeineAmount;

            System.out.println("It would take about " + numberOfDrinks + " drinks for a lethal overdose.");

    }
}
