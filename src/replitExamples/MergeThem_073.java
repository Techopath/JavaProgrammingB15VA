package replitExamples;
import java.util.*;
public class MergeThem_073 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words comprising of 3 characters: ");
        String w1 = scan.next();
        String w2 = scan.next();
        int w1Length = w1.length();
        int w2Length = w2.length();
       //String mergeThem = "";
        System.out.println("word 1 = "+w1 + " word 2 = " +w2);
        if (w1Length == 3 && w2Length ==3){

            System.out.println(""+w1.charAt(0)+w2.charAt(0)+w1.charAt(1)+w2.charAt(1)+w1.charAt(2)+w2.charAt(2));
        }else {
            System.out.println("Cannot merge");
        }



    }
}
