package replitExamples;
import java.util.*;
public class PrintHalfTwice_77 {
    public static void main(String[] args) {

           Scanner scan = new Scanner(System.in);
        System.out.println("Type any word to print out half twice");
        String word = scan.next();

            //WRITE YOUR CODE HERE
      int wLength = word.length()/2;
        String half = "";


//        String w = "java";
//        String half = "";
//        int wlength = w.length()/2;//ja
        for (int i = 0; i < wLength; i++) {
            half = half + word.charAt(i);


        }
        half +=half;
        System.out.println(half);







    }


        }


