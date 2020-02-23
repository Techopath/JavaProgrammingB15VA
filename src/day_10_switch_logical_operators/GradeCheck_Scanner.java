package day_10_switch_logical_operators;
import java.util.Scanner;
public class GradeCheck_Scanner {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your grade in letter: ");
            int grade = scan.nextInt();

            if (grade == 50) {
                System.out.println("Excellent");
            } else {
                System.out.println("Unknown grade!");
            }
        }
    }
}
