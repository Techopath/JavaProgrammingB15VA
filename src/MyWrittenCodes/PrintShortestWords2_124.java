package MyWrittenCodes;
import java.util.*;
import java.util.zip.GZIPOutputStream;

public class PrintShortestWords2_124 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] splittedStr = str.split(",");
        System.out.println(Arrays.toString(splittedStr));
        String [] shorts =new String[3];
        for (int i=0;i<splittedStr.length; i++){
            if (splittedStr[0].length()>splittedStr[i].length()){
                shorts [i] = splittedStr[i]+",";

            }
            Arrays.sort(shorts);
        }

        System.out.println(Arrays.toString(shorts));
    }
}
