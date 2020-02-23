package day_08_if_statements;
import java.util.Scanner;
public class ExamResult {
    public static void main(String [] args) {
        while (true) {
        System.out.println("Enter your score: ");

            Scanner input = new Scanner(System.in);
            int passingScore = 60;
            Double score = input.nextDouble();
            if (score >= passingScore && score <= 80) {
                System.out.println("Congratulations, you did a good job");

            } else if (score > 80) {
                System.out.println("Excellent! yo did a great job!");
            } else if (score < 60 && score > 0) {
                System.out.println("The score is very low");
            } else {
                System.out.println("Invalid score value");
            }

        }
    }
}
