package replitExamples;
import java.util.*;
public class Ternary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = scan.nextInt();
        //WRITE YOUT CODE HERE

        String y=(x>=5) ? "greater than" : "equal to";
        System.out.println(x +" is " +y);



    }
}
