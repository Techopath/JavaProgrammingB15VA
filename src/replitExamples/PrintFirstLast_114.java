package replitExamples;
import java.util.Arrays;
import java.util.*;
public class PrintFirstLast_114 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
        String[] words = {"ata", "ocha", "mommmmaaas"};
        String firstLast ="";
String [] fl = new String [words.length];
        for (int j = 0; j <words.length ; j++) {
            fl [j] = ""+words[j].charAt(0)+words[j].charAt(words[j].length()-1);
        }
        System.out.println(Arrays.toString(fl));

        //TODO: Write your code below
//        for (int i = 0; i < words.length; i++) {
//            firstLast = firstLast + words[i].substring(0,1)+""+words[i].substring(words[i].length()-1)+", ";
//
//
//        }
//        System.out.print("["+firstLast.substring()+"]");
//
//
//
//
//

    }
}

