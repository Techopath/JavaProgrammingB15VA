package day_13_string_manipulation;



public class Position_of_letters_charAt {
    public static void main(String[] args) {
        String str = "java";
        System.out.println(str.charAt(0));
        char ch= 'a';
        if (str.charAt(2) == ch){
            System.out.println("the characters match");
        }else{
            System.out.println("the characters does not match. the char in the word is "+ "\"" +str.charAt(2)+
                    "\""+" but we need char \"" +ch+"\"");
        }
        System.out.println(str.charAt(0)+ "\n" +str.charAt(3));
        //-------------------------------------//
        String word ="civic"; //palindrome word an interview question
        //read first and last characters and store into firstL, lastL variables
        //put a condition if they match
        //if yes, --> ""first and last match"" if no, "first and last does not match"
        char firstL = word.charAt(0);
        char lastL = word.charAt(4); //word.charAt(word.length()-1)
        if (firstL == lastL){
            System.out.println("firstL and lastL match and the char is " + firstL);
        }else {
            System.out.println("no match");
        }
        //or possible as following
        /*
        if (word.charAt(0) == word.charAt(4)){
            System.out.println("first and last match");
        }else {
            System.out.println("first and lsat does not match");
        }*/
        // print out c i v i c
        String newString = word.charAt(0) + " " +word.charAt(1)+ " " + word.charAt(2) + " " + word.charAt(3) +" "+word.charAt(4);
        System.out.println(newString);
        //-----
        newString = newString.toUpperCase();

        System.out.println(newString.contains("U"));//checks the existence of the letter inside the variable newString

    }
}
