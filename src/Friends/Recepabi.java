package Friends;
import java.util.*;
public class Recepabi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //String word = scan.next();
        //             01234
        String word = "apple";
        //WRITE YOUR CODE HERE
        String reversed = "";
        System.out.println(word.length());
        int wordLength = word.length();

        for (int i =wordLength-1; i>=0; i--){
            reversed = reversed + word.charAt(i);
        }
        System.out.println(reversed);





    }
}