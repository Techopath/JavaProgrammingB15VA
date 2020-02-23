package replitExamples;
import java.lang.invoke.StringConcatFactory;
import java.util.*;
public class Arrays_ReverseSentence_111 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //String sentence = input.nextLine();
        String sentence = "Java is fun";

        //TODO: Type your code below

        String [] reversed = sentence.split(" ");
        for (int i = reversed.length-1; i >=0; i--) {
            System.out.println(reversed[i]);
        }



    }
}
