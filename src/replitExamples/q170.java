package replitExamples;
import java.util.*;
public class q170 {

    public static void main(String[] args) {

        System.out.println(clean("a bad guy is like a bad boy", "bad"));
    }

    public static String clean (String text ,String badWord) {
        String [] strSplit = text.split(" ");
        String newStr = "";
        for (int i = 0; i<strSplit.length; i++){
            if (!badWord.equals(strSplit[i])){
                newStr = newStr + strSplit[i]+" ";
            }
            newStr = newStr.substring(0, newStr.length());
        }
return newStr;

    }
}
