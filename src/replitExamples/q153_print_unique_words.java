package replitExamples;
import java.util.*;
public class q153_print_unique_words {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int size = scan.nextInt();
////        String[] words = new String[size];
////        for(int i=0; i < size; i++){
////            words[i] = scan.next();
////        }
        String [] words = {"java", "code", "python", "code", "rust", "code", "rust"};
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words){
        //WRITE YOUR CODE HERE
        int count =0;
        //String uniqueWords = "";

        for (int i = 0; i < words.length; i++) {

            count = 0;
            for (int j = 0; j < words.length; j++) {

                if (words[i].equals(words[j])) {
                    count++;

                }

            }
            if (count == 1) {
               // uniqueWords = uniqueWords + words[i] + ",";

                System.out.println(words[i]);
            }
        }



       // System.out.println("uniqueWords = " + uniqueWords);



    }
}
