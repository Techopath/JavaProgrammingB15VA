package replitExamples;

public class q169_countWords {

    public static void main(String[] args) {

        System.out.println(wordCount("man is good when he is polite ."));
    }
    public static int wordCount(String words) {

        String [] splittedString = words.split(" ");

        return splittedString.length;

    }
}
