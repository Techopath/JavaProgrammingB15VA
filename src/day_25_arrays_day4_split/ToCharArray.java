package day_25_arrays_day4_split;

import java.util.Arrays;

public class ToCharArray {
    public static void main(String[] args) {
        String word = "java";
        char[] letters = word.toCharArray();
        System.out.println("letters length: "+letters.length);

        for (char l :letters) {
            System.out.println(l);
        }

        System.out.println();

        //sort letters array
        Arrays.sort(letters);//aajv

        //print all in same line separated by comma
        System.out.println(Arrays.toString(letters));

        System.out.println();

        String str = "asfsgagadsgadfgadfgadg";
        char[] strArray = str.toCharArray();
        Arrays.sort(strArray);
        System.out.println(Arrays.toString(strArray));

        //after sorting, create a new string with that value of array
        String sorted = new String(strArray);
        System.out.println("str: "+str);
        System.out.println("sorted: "+sorted);

    }
}
