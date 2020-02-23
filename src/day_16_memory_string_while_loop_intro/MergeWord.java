package day_16_memory_string_while_loop_intro;

public class MergeWord {
    public static void main(String[] args) {
        String pattern = "{[]}";
        String word = "java";
        String f2 = pattern.substring(0, 2);
        String l2 = pattern.substring(2, 4);
        word = f2 + word + l2;
        System.out.println(word);
    }
}
