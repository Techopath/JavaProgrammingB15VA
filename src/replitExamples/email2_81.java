package replitExamples;
import java.lang.invoke.StringConcatFactory;
import java.util.*;
public class email2_81 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type email: ");
        String email = scan.nextLine();
        int length = email.length();
        String firstName = "";
        String lastName = "";
        String Domain ="";
        String topDomain = "";
        String nameFL = "";
        String lastFL = "";
        if (!email.contains("_")){
            System.out.println(email);
            return;

        }else {

           firstName = email.substring(0, email.indexOf("_"));
            nameFL = (firstName.charAt(0)+"").toUpperCase();
            //System.out.println(nameFL);
            firstName = nameFL+firstName.substring(1,firstName.length());
            lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
            lastFL = (lastName.charAt(0)+"").toUpperCase();
            lastName = lastFL + lastName.substring(1, lastName.length());
            Domain = email.substring(email.indexOf("@")+1, email.indexOf("."));
            topDomain = email.substring(email.indexOf(".")+1, length);
            System.out.println("First name: " + firstName);
            System.out.println("Last name: " + lastName);
            System.out.println("Domain: " + Domain);
            System.out.println("Top-level domain: " + topDomain);
        }





    }
}
