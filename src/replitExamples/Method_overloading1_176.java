package replitExamples;
import java.util.*;
public class Method_overloading1_176 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int [] a = new int[size];
        for (int i = 0; i < size ; i++) {
            a[i] = input.nextInt();
        }
        System.out.println(findMax(a));
        double [] b = new double[size];
        for (int i = 0; i < size ; i++) {
            b[i] = input.nextDouble();
        }
        // double [] b = {1.2, 5.2, 10.5};
        System.out.println(findMax(b));
    }


    //WRITE YOUR CODE HERE


        public static int findMax (int [] ArrayOfNumbers){

            int max = ArrayOfNumbers[0];

            for (int i =0; i<ArrayOfNumbers.length; i++){
                if (max < ArrayOfNumbers[i]){
                    max = ArrayOfNumbers[i];
                }
            }
            return max;

        }
        // overload with different parameters

        public static double findMax(double [] ArrayOfNumbers ){

            double max = ArrayOfNumbers[0];
            for (int i =0; i<ArrayOfNumbers.length; i++){
                if (max < ArrayOfNumbers[i]){
                    max = ArrayOfNumbers[i];
                }
            }
            return max;
        }



}
