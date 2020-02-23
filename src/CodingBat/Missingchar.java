package CodingBat;
import java.util.*;
public class Missingchar {

    //if you cant find the following solution. try substring method with back and front. 
    public static void main(String[] args) {
        missingchar("kitten", 2);
        System.out.println(missingchar("kitten", 2));
    }
    public static String missingchar(String str, int n){
        List<Character> chars = new ArrayList<>();
        for(int i=0; i<str.length(); i++){
            chars.add(str.charAt(i));
        }
        String s = "";

        for(int i=0; i<chars.size(); i++){
            if (n==chars.get(i)){
                chars.remove(i);
                if(n !=i){
                    s = s + chars.get(i);
                }

            }
        }

        return s;

    }
}
