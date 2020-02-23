package replitExamples;
import java.util.Scanner;
public class PrintFirstAndLastLetters {
    public static void main(String[] args) {
        System.out.println("Enter any word. You will see the first and last characters together");
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String nWord = "";
        nWord = nWord+ word.charAt(0) + word.charAt(word.length()-1);
        System.out.println(nWord);

    }
}
