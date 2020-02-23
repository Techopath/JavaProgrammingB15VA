package replitExamples;
import java.util.*;
public class FindMaxStringLength_Arrays_118 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }
//        String [] words = {"aa","asdf","asd", "a","muhammad", "zxcvb"};
        String w =words[0];
        for (int i = 0; i < words.length-1; i++) {
            if(words[i].length()>words[i+1].length()){
                w =words[i];
            }else{
                w =words[i+1];
            }
        }
        System.out.println(w);
//        if (words[0].length()>words[1].length()){
//            System.out.println(words[0]);
//        }else{
//            System.out.println(words[1]);
//        }
//
//        System.out.println(words[0].length());
//
//        System.out.println(Arrays.toString(words));

        //write your code below



        }

    }

