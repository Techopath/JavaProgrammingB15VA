package day_16_memory_string_while_loop_intro;

public class SMSMEssage {
    public static void main(String[] args) {
        String message = "Sender: [John Doe], From number<5714127546>, Message:{Hey, whats up!}";
        String sender = "";
        String fromNumber = "";
        String txt = "";

        System.out.println(message.indexOf("["));
        System.out.println(message.indexOf("]"));
        System.out.println(message.substring(message.indexOf("[")+1, message.indexOf("]")));

        System.out.println(("phone number: ") +message.substring(message.indexOf("<")+1, message.indexOf(">")));
        System.out.println("txt: " +message.substring(message.indexOf("{")+1, message.indexOf("}")));


    }
}
