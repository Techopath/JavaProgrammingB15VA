package replitExamples;
import java.util.Scanner;
public class LongestWord {
    public static void main(String[] args) {
        //DO NOT CHANGE
        System.out.println("Type two words: ");
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //WRiTE YOUR CODE HERE
        if(word1.length() >word2.length()){
            System.out.println(word1);
        }else{
            System.out.println(word2);
        }
    }



    }
