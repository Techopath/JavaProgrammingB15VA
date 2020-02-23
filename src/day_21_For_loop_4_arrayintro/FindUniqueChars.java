package day_21_For_loop_4_arrayintro;
import java.util.*;
public class FindUniqueChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any word: ");
        String word = scan.nextLine();
            //String str = "java";
            String uniqueChars = "";

            //loop until end of str
        for (int n =0; n<word.length();n++){
                String temp = word.charAt(n)+"";
                System.out.println("temp = "+temp);
                //check if str is in unique, if not add to it.
                if (!uniqueChars.contains(temp)){
                    uniqueChars =uniqueChars + temp;


                }
            }
        System.out.println("Unique chars: " + uniqueChars);

    }
}
