package replitExamples;
import java.util.*;
public class HasJava_96 {
    public static void main(String[] args) {
        boolean exists = false;
//        Scanner scan = new Scanner(System.in);
//        String word = scan.next();

        String word = "on";
        if (word.length() >= 5) {
            if (word.substring(0, 4).equalsIgnoreCase("java") || word.substring(1, 5).equalsIgnoreCase("java")) {

                //String found = word.substring(1, 5).equalsIgnoreCase("java") + "";

                System.out.println(true);
            } else {
                System.out.println(exists);
            }
        } else {
            System.out.println(exists);
        }

    }
}






