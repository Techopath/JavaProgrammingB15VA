package replitExamples;
import java.util.*;
public class sliceNumber {
    public static void main(String[] args) {
                //   01234
            //int n1 = 12345;
        System.out.println("Enter your number:");
        Scanner scan = new Scanner(System.in);
        //int num, digit1, digit2, digit3, digit4, digit5;
        //WRITE YOUR CODE HERE
        int n =scan.nextInt();
        String num = ""+n;
        //System.out.println(num);
        for (int i=0;i<=num.length()-1;i++){
            System.out.println(num.charAt(i));
        }
    }
}
