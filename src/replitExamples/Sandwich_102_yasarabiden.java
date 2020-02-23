package replitExamples;
import java.util.*;
public class Sandwich_102_yasarabiden {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count=0;



        for (int i=0 ; i<=str.length()-5 ;i++ ){    // first find how many bread
            if(str.substring(i,i+5).equals("bread")){
                count++;
            }
        }

        int start = str.indexOf("bread");
        int end = str.lastIndexOf("bread");
//        System.out.println("start: "+start);
//        System.out.println("end"+end);
        if (count>=2){
            System.out.println(str.substring(start+5, end));//begins with index at bread

        }else{
            System.out.println("nothing");
        }

    }
}
