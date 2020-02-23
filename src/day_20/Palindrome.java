package day_20;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        //Scanner scan =new Scanner(System.in);
        //String word = scan.next();
        String word = "Mother";
        word = word.toLowerCase();
        System.out.println(word);
        //remove spaces
        word = word.replace(" ", "");
        System.out.println(word);
        String reversed = "";
        System.out.println();
        for (int i=word.length()-1; i>=0; i--){
            //System.out.print(word.charAt(i));
            reversed = reversed + word.charAt(i);

        }
        System.out.print("reverse of "+ word +" is "+reversed);
        System.out.println();
        if (word.equals(reversed)){

            System.out.println(word + " Palindrome");
        }else{
            System.out.println(word + " not palindrome");
        }




    }
}
