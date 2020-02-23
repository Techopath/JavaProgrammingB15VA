package replitExamples;
import java.util.*;
public class VerifyContains {
    public static void main(String[] args) {
        System.out.println("type a word and a sentence: ");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();
        //WRITE YOUR CODE HERE using IF statement and contains method
        if (sentence.contains(word)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }


    }
