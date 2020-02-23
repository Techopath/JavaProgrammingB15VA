package replitExamples;
import java.util.*;
public class PrefixAgain_101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        String str = scan.next();
//        int n = scan.nextInt();
//         01234
        ///javaj
        String str = "javaxjavavf";
        int n = 1;
        int count =0;
//       String s = "";
        int length = str.length();
        String s = str.substring(0,n);



        System.out.println("the length of string: "+length);
        System.out.println("our prefix is: "+s);



        for (int i = 0; i<length-n; i++){    //
            if (str.substring(i,i+n).equals(s)){
                count++;



            }


        }
        if (count>1) {
            System.out.println(true);
        }else if(count<=1){
            System.out.println(false);


        }

        System.out.println(count);



        }

}
