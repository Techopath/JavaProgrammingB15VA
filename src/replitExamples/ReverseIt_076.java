package replitExamples;
import java.util.*;
public class ReverseIt_076 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input: ");
        String word = scan.next();
        //WRITE YOUR CODE HERE
        //System.out.println(word);
        String reverse = "";
        int wLength = word.length();
        for (int i = word.length()-1; i >=0 ; i--) {

            if (wLength == 5){
            reverse = reverse + word.charAt(i)+"";
            }
        }
        System.out.print(reverse);
        if (wLength < 5) {
            System.out.println("Too short!");

        }else if (wLength>5) {
            System.out.println("Too long!");
        }



    }
}
