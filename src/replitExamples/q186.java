package replitExamples;
import java.util.*;
public class q186 {
    public static void main(String [] args){
        System.out.println(extractNum("asd123@3$asd"));
    }
    public static String extractNum(String s) {
        String numberz = "";
        for (int i=0; i<s.length(); i++){
            if (Character.isDigit(s.charAt(i))){
                numberz = numberz + s.charAt(i);
            }
        }

return numberz;
    }
}
