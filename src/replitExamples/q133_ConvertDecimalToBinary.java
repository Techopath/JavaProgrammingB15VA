package replitExamples;
import java.util.*;
public class q133_ConvertDecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int decimal = input.nextInt();
        int[] binary = new int[8];

        //TODO: Write your code below.
//        int [] numbers = {128, 64, 32, 16, 8, 4, 2, 1};
//
//        int sum = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            if (decimal < numbers[i]){
//                binary[i]=0;
//
//            }else{
//                binary[i]=1;
//            }
//        }
//        System.out.println(Arrays.toString(binary));


        //TODO: Write your code below.
        for (int i = 7; i >=0; i--) {
            binary[i]= decimal%2; // if decimal is 5...binary[7]=1. if decimal = 10, binary [7] =0;
            decimal = decimal/2;//decimal is 5....

            if (decimal ==0){
                break;
            }
        }
        System.out.println(Arrays.toString(binary));




    }
}
