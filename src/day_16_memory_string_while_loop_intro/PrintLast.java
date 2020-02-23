package day_16_memory_string_while_loop_intro;

public class PrintLast {
    public static void main(String[] args) {
        String word = "hello the world. you know what java is fun!";
        System.out.println(word.charAt(2));
        System.out.println(word.length()); //length() counts the character in the word and prints out the total number it contains.
        System.out.println(word.charAt(word.length()-1)); //prints out the last character. don't forget to add -1.

        //also possible as following
        int count = word.length();
        System.out.println(word.charAt(count-1));

    }
}
