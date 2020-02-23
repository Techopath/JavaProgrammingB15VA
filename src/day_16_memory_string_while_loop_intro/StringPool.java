package day_16_memory_string_while_loop_intro;

public class StringPool {
    public static void main(String[] args) {
        String word1 = "java"; //string pool
        String word2 = "java";//string pool re-use
        String word3 =new String ("java");//outside pool, heap
        System.out.println(word1 == word2 ); //true. both are pointing to the same object in string pool
        System.out.println(word1== word3);//false, because word 1 and word 2 are pointing to different objects in memory.
        //when we use == , it does not check if values are matching.
        //it only checks if variables are pointing to same object in memory/

        String word4 = new String("java"); //outside pool
        System.out.println(word3==word4);//false
        String word5 = word4;
        System.out.println(word5 == word4);//true, word5 and word4 are pointing to same object in the heap memory.

        System.out.println(word1 == word4); //false
        System.out.println(word1.equals(word4));//true, values match "java"
        String str = "macbook"; // string pool in heap

        String str2 = "macbook"; //re-use "macbook" in pool
        String str3 = str; //point to same object as str


    }
}
