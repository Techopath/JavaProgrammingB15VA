package day_16_memory_string_while_loop_intro;

public class StringPractice {
    public static void main(String[] args) {
        String word = "dad";
        String reversed = "";
        System.out.println(word.charAt(2));
        reversed += word.charAt(2);
        System.out.println("reversed: " +reversed);
        reversed += word.charAt(0);
        System.out.println("reversed: "+reversed);
        reversed += word.charAt(1);
        System.out.println("reversed: "+reversed);
    }
}
