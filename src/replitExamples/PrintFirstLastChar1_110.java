package replitExamples;
import java.util.*;
public class PrintFirstLastChar1_110 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        //TODO: Write your code below


        System.out.println(Arrays.toString(words));
        //System.out.println(words[3]);
        String fl = "";
        for (int i = 0; i < words.length; i++) {
            fl = words[i].substring(0,1)+words[i].substring(words[i].length()-1, words[i].length());
            System.out.println(fl);

        }



    }
}
