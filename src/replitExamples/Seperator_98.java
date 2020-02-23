package replitExamples;
import java.util.*;
public class Seperator_98 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();

//write your code here
        int separatorLength = separator.length();

        String combinedWords = "";
        if (count == 1){
            word =  word;
            System.out.println(word);
            return;

        }


        if (count >=2) {
            for (int i = 0; i < count; i++) {
                combinedWords = combinedWords + word + separator;

            }
        }
        combinedWords = combinedWords.substring(0,combinedWords.length()-separatorLength); //we put negative 2 because /
        // our for loop starts with 0.



        System.out.println(combinedWords);

    }
}