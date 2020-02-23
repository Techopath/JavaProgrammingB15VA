package replitExamples;
import java.util.*;
public class Factorial_93 {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
        long n = 16;

        //write your code here
        long factorial = 1;

        for (int i =1; i<=n; i++) {
            factorial = factorial * i;
            System.out.println("factorial upto "+i +" is "+factorial);

        }
        System.out.println(factorial);

    }
}
