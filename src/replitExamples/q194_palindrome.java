package replitExamples;

public class q194_palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Nurses run"));
    }
    public static boolean isPalindrome(String check) {
        check = check.replace(" ", "");
       // System.out.println(check);
        int len = check.length();
        String reversedCheck = "";
        for (int i = check.length()-1; i >= 0 ; i--) {
            reversedCheck = reversedCheck + check.charAt(i);
        }
        //System.out.println(reversedCheck);
        if (reversedCheck.equalsIgnoreCase(check)) {

            return true;
        }else{
            return false;
        }



    }
}
