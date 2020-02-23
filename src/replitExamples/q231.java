package replitExamples;

public class q231 {
    public static void main(String[] args) {
        System.out.println(reverseVowels("apple"));
    }
    public static char[] reverseVowels(String str) { //apple => eppla
        char[] strChars = str.toCharArray();
        char[] reverseStrChars = new char[strChars.length];
        String reverseVowels = "";
        for (int i = strChars.length-1, j=0; i >=0 ; i--) {
            reverseStrChars[j] = strChars[i];
            j++;
        }
        for (int i = 0; i < reverseStrChars.length; i++) {
            if(reverseStrChars[i] == 'a' ||reverseStrChars[i] == 'e' ||reverseStrChars[i] == 'y' ||reverseStrChars[i] == 'o' ||reverseStrChars[i] == 'u'){

                 reverseVowels += reverseStrChars[i];
            }
        }
       //System.out.println(Arrays.toString(reverseStrChars));
        char ch;
        for (int i = 0,j=0; i < reverseStrChars.length; i++) { //[y, d, e, m, e, r]
            if(strChars[i] == 'a' ||strChars[i] == 'e' ||strChars[i] == 'y' ||strChars[i] == 'o' ||strChars[i] == 'u'){

               strChars[i] = reverseVowels.charAt(j);
               j++;
            }
        }
        //System.out.println(Arrays.toString(strChars));
      return strChars;

    }
}
