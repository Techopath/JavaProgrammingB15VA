package day_04_math_operators_scanner;

public class StringConcatination {
    public static void main(String [] args){
        String str = "My name is ";
        String firstName = "Adam";
        String lastName = "Smith";
        System.out.println(str +firstName +" "+ lastName);
        /////
        String str1 = "Hello";
        String str2 = "Friends!";
        System.out.println(str1 + str2);
        System.out.println(str1 + " " + str2);
        //declare str3 and assign str1 and str2 with space
        //then print out
        String str3 = str1+" my reliable " +str2;
        System.out.println(str3);
    }
}
