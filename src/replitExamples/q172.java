package replitExamples;

public class q172 {

    public static void main(String[] args) {
        String target = "blabla";
        String word = "a";
        String nWord = target.substring(0,3) + word + target.substring(3, target.length());
        System.out.println(nWord);
    }
}
