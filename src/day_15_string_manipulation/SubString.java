package day_15_string_manipulation;

public class SubString {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.substring(0,2));//ja
        System.out.println(word.substring(0,1));//j
        System.out.println(word.substring(0,3));//jav
        System.out.println(word.substring(2,3));//v
        System.out.println(word.substring(1,3));//av
        //System.out.println(word.substring(2,10));//there is no 10 index in word, it gives error

        System.out.println("1123");

        String word1 = "java is fun";
        //print java
        System.out.println(word1.substring(0,4));
        //print is
        System.out.println(word1.substring(5,7));
        //print fun
        System.out.println(word1.substring(8,11));
        System.out.println(word1.substring(8)); //it goes until the end and prints out the result

    }
}
