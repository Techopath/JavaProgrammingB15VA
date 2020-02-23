package replitExamples;
import java.util.*;
public class SMS_message_82 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender;
        String phoneNumber;
        String messageBody;
        System.out.println("Sender: "+message.substring(message.indexOf("<")+1, message.indexOf(">")));
        System.out.println("Phone number: "+message.substring(message.indexOf("[")+1, message.indexOf("]")));
        System.out.println("Message body: "+message.substring(message.indexOf("{")+1,message.indexOf("}")));






    }
}
