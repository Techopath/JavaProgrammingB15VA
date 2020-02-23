package day_16_memory_string_while_loop_intro;

public class StartEnd {
    public static void main(String[] args) {
        String str = "i love [python java script] programming";
        System.out.println(str.substring(8,12));

        int start = str.indexOf("[");
        int end = str.indexOf("]");
        System.out.println(str.substring(start+1, end));

    }
}
