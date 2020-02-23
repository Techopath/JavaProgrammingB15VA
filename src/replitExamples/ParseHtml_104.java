package replitExamples;
import java.util.Scanner;
public class ParseHtml_104 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String html = scan.nextLine();

        //for (int i = 0; i<html.length()-5; i++){

        int start = html.indexOf("\"");
        int end = html.lastIndexOf("\"");
        if (html.contains("<html>")){
            System.out.println(html.substring(start, end));
        }else{
            System.out.println("Invalid input!");
        }
        // }


    }
}
