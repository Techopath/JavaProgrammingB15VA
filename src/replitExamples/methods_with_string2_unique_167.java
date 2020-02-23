package replitExamples;

public class methods_with_string2_unique_167 {

    public static void main(String[] args) {
        //test your code
        System.out.println( uniqueChars("wooden-spoon") ) ;
    }

    public static String uniqueChars(String str) {
        //TODO: write your below

        String uniqueChar = "";

        for (int i = 0; i < str.length(); i++) {
            String temp = str.charAt(i)+"";
            if (!uniqueChar.contains(temp)){
                uniqueChar = uniqueChar+temp;

            }
        }
        return  uniqueChar;
    }
}
