package day_14_string_manipulation;

public class IndexOf {
    public static void main(String[] args) {
        String word = "java";//0123
        System.out.println(word.indexOf("v"));//2
        System.out.println(word.indexOf("a"));//1
        System.out.println(word.indexOf("va"));//gives the index of v not both//2
        System.out.println(word.indexOf("j"));//0
        System.out.println(word.indexOf("hello"));//-1

        ////////////////012345
        String word2 = "github";
        System.out.println(word2.indexOf("g"));//0
        System.out.println(word2.indexOf("b"));//5

        if (word2.indexOf("i") == 1){
            System.out.println("the index of i is 1");
            int x = 10 * word2.indexOf("i");
            System.out.println(x);
        }


    }
}
