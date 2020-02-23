package replitExamples;

public class q195_anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("Star", "rats"));
    }

    public static boolean isAnagram(String word1, String word2) {
        /*word1  = listen words2 = silent*/
        boolean isTrue = true;
        int count = 0;

word1 =word1.toLowerCase();
word2 = word2.toLowerCase();
        for (int i = 0; i < word1.length(); i++) {
           char chi = word1.charAt(i);
            count = 0;
            for (int j = 0; j < word2.length(); j++) {
                char chj = word2.charAt(j) ;
                if (chi == word2.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
               isTrue = isTrue;

            } else {
                isTrue =false;
            }

        }
       return isTrue;
    }
}