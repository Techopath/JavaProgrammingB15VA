package day_36_wrapper_arraylist;

public class CharacterWrapper {
    public static void main(String[] args) {
        char ch2 = '5';
        System.out.println(Character.isDigit(ch2));
        System.out.println(Character.isLetterOrDigit(ch2));
        System.out.println(Character.isLetter(ch2));
        System.out.println("-----------");

        char ch3 = '%';
        System.out.println(Character.isDigit(ch3));
        System.out.println(Character.isLetter(ch3));
        System.out.println(Character.isLetterOrDigit(ch3));
        System.out.println(!Character.isLetterOrDigit(ch3));

        System.out.println("------------");
        char ch4 =' ';
        System.out.println(Character.isWhitespace(ch4));
        System.out.println(Character.isSpaceChar(ch4));

        System.out.println("-------------------");

        String firstName = "John";
        //test if firstName starts with upperCase letter
        if (Character.isUpperCase(firstName.charAt(0))){
            System.out.println("Pass: firstname starts with upper case letter");
        }else{
            System.out.println("Fail: firstname is not upper case letter");
        }

    }
}
