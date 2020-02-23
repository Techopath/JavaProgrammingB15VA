package replitExamples;

import java.sql.SQLOutput;

public class q232_countLetters {

    public static void main(String[] args) {
        String letters = "aaabbcccca";

        System.out.println(countLetters(letters));
    }

    public static String countLetters(String str){

        char[] charOfLetters= str.toCharArray();
        System.out.println(charOfLetters);
        String countOfLetters = "";

        int count=0;

        for (int i = 0; i < charOfLetters.length; i+=count) {
            count=0;
            for (int j = 0; j < charOfLetters.length; j++) {
                if (charOfLetters[i] == charOfLetters[j]){
                    count ++;


                }
            }


            countOfLetters = countOfLetters +count+charOfLetters[i];
        }

return countOfLetters;
    }

//    public static void main(String[] args) {
//        String letters = "aaabbcccc";
//        countLetters(letters);
//        System.out.println(countLetters(letters));
//    }
//
//    public static String countLetters(String str){
//
//        String countLet= "";
//        int count=0;
//
//        for (int i = 0; i < str.length(); i++) {
//            count=0;
//            for (int j = 0; j < str.length(); j++) {
//                if(str.charAt(i)==str.charAt(j)){
//                    count ++;
//                }
//            }
//            countLet = count+str.charAt(i)+"";
//        }
//
//
//        return countLet;
//    }
}
