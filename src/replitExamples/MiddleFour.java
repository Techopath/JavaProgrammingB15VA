package replitExamples;

public class MiddleFour {
    public static void main(String[] args) {

        //            0123
        String str = "goodness";
        //we need to print out the middle three characters ous
        String newString = "";
        //Scanner scan = new Scanner(System.in);
        //String word = scan.next();
        //YOUR CODE HERE
        int wordL = str.length();
        if (str.length() < 3) {
            System.out.println("invalid value");
        } else if ((str.length() >= 4) && (str.length() % 2 == 0)) {
            newString = "" + str.charAt(str.length() / 2-1) + str.charAt((str.length() / 2));
        } else {
            System.out.println("even characters expected");
        }
        System.out.println(newString);
    }
}
