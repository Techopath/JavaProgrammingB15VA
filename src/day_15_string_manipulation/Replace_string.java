package day_15_string_manipulation;

import java.util.Locale;

public class Replace_string {
    public static void main(String[] args) {
        String word = "java";
        String newWord = word.replace("j", "c");
        System.out.println(newWord);
        System.out.println(word.replace("ja", "dc"));
        System.out.println(word.replace("dog", "cat"));
        System.out.println(word.replace("a", "q"));

        //-------------------------------

        String oldWords = "[sad, cry, python]";

        System.out.println(oldWords.replace("sad", "happy"));
        System.out.println(oldWords.replace("cry", "smile"));
        System.out.println(oldWords.replace("python", "c++"));

        //---
                String newWords = oldWords.replace("sad" , "{happy happiness happily unhappy all have happy within}");
        System.out.println("new words set is "+newWords);
        System.out.println("old words set was "+oldWords);

        //--happy, smile, java => happy | smile | java

        oldWords = oldWords.replace(", ", "|"); //finds and replaces all the , with |

        System.out.println(oldWords);

        String capital = "London is the capital of UK";
        String myCapital = capital.replace("London", "Dushanbe" ).replace("UK", "Tajikistan");
        System.out.println(myCapital);
        //System.out.println(myCapital.replace("UK" , "Tajikistan"));



    }
}
