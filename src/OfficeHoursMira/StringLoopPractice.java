package OfficeHoursMira;

public class StringLoopPractice {
    public static void main(String[] args) {
        /*
        String sentence
        count how many times we have word java in our sentence

       ignore if java is part of another word
       count for upper and lowercase
         */
        int count = 0;
        String sentence = "Java is fun, and we love javajavajavajavavaja";
        String word ="java";
        for (int i = 0; i <sentence.length()-3 ; i++) {
            if (sentence.substring(i, i + 4).equalsIgnoreCase(word)) {

            count ++;

            }
        }
        System.out.println(count);
        /*
        get length of sentence -> save
        get length of word -> save
        convert sentence and word all to lowercase
        replace all words in sentence with ""
        get the length of resulted sentence

        find
         */
    }
}
