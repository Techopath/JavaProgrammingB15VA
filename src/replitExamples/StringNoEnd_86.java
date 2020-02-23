package replitExamples;
import java.util.*;
public class StringNoEnd_86 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here
        String newTxt = "";
        int length = txt.length();
        newTxt = newTxt+txt.substring(0,length-1)+"";
        System.out.println(newTxt);

    }
}
