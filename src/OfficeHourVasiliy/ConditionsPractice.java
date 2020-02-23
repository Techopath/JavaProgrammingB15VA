package OfficeHourVasiliy;
import java.util.Scanner;
public class ConditionsPractice {
    public static void main(String [] args){
        //while (true) { //it keeps asking Enter your score value
            Scanner scanner = new Scanner(System.in);

                System.out.println("Enter your score value: ");
                int score = scanner.nextInt();
                //if score is grater than 75 print passed, otherwise print failed.
                if (score < 0) { //if score is invalid there is no reason to continue
                    System.out.println("Invalid Score.");
                    return; //stops program
                }
                if (score > 100) {
                    System.out.println("invalid score.");
                    return;
                }
                if (score >= 75) {
                    System.out.println("Passed. Congratulations!");
                } else {
                    System.out.println("Failed. Try hard!");
                }

        //}
    }
}
