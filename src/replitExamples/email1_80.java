package replitExamples;
import jdk.jshell.Snippet;

import java.util.*;
public class email1_80 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter your email: ");
        String email = scan.next();
        int length = email.length();
        //System.out.println(length);


        if (!email.contains("_")){
            System.out.println(email);
            return;

        }else{

            //System.out.println("The email contains underscore _");
            String first = email.substring(email.indexOf(email.charAt(0)), email.indexOf("_"));
            String last = email.substring(email.indexOf("_")+1, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@"), length);

            System.out.println(last +"_"+ first + domain);

        }



    }
}
