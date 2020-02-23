package replitExamples;
import java.util.*;
public class MiddleLetter_71 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the single or a word containing odd number of characters: ");
        String word = scan.next();
        //YOUR CODE HERE
        int wordLength= word.length();

        if (wordLength ==1){

            System.out.println("" + word.charAt(0)+word.charAt(0)+word.charAt(0));
        }else if (wordLength ==3) {
            System.out.println("" +word.charAt(1));
        }else if (wordLength ==5) {
            System.out.println("" + word.charAt(2));
        }else if(wordLength == 2){
            System.out.println(""+word.charAt(0)+word.charAt(1)+word.charAt(0)+word.charAt(1));
        }else if (wordLength ==4){
            System.out.println(""+word.charAt(1)+word.charAt(2));
        }else if (wordLength ==6) {
            System.out.println("" + word.charAt(2) + word.charAt(3) );

        }else {
            System.out.println("Enter a word which is either has single character, or at most 6 number of characters ");
        }




    }
}
