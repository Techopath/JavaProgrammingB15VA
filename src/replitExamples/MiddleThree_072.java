package replitExamples;
import java.util.*;
public class MiddleThree_072 {
    public static void main(String[] args) {

       //             01234
        String str = "apple";
        //we need to print out the middle three characters ous
String newString = "";
            //Scanner scan = new Scanner(System.in);
            //String word = scan.next();
            //YOUR CODE HERE
            int wordL = str.length();
         if(str.length()<5 || str.length()%2 ==0){
             System.out.println("invalid value");
             return;
         }else if((str.length()>=5)&&(str.length()%2!=0)){
            newString = ""+str.charAt(str.length()/2-1)+str.charAt((str.length()/2))+str.charAt((str.length()/2)+1);
         }else {
             System.out.println("odd characters expected");
         }
        System.out.println(newString);




    }
}