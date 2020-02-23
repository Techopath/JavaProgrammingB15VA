package replitExamples;
import java.util.*;
public class Arrays_Diving_129 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        //WRITE YOUR CODE HERE
        System.out.println("Enter scores: ");
        for (int i = 0; i < 7; i++) {
            score[i] = input.nextFloat();
        }
        System.out.println("Enter difficulty degree: ");
        float degreeOfDifficylty = input.nextFloat();

        float highest = score[0];
        float lowest = score[0];
        double total = 0;
        double coef = 0.6;

        for (int i = 0; i < score.length; i++) {
            if (highest < score[i]) {
                highest = score[i];

            } else if (lowest > score[i])
            {
                lowest = score[i];

            }


            total = total + score[i];

        }
        total = ((total-(highest+lowest))*degreeOfDifficylty*coef);
        System.out.println(Arrays.toString(score));

        System.out.println(highest);
        System.out.println(lowest);


        // FINAL OUTPUT
        System.out.printf("Total: %.2f", total);
    }
}
