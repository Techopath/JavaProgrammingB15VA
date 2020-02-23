package MyWrittenCodes;
import java.util.Scanner;
public class ConvertYourName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any sentence to see how many letters it has");
        String sentence1 = input.nextLine();
        String sentence2 = input.nextLine();
        int nochar1= sentence1.length();
        int nochar2 = sentence2.length();
        String upperCase = sentence1.toUpperCase();
        System.out.println("The upper case letters for the sentence: " +upperCase);
        String lowerCase = sentence2.toLowerCase();
        System.out.println("The lower case letters for the sentence: " + lowerCase);

        if (nochar1 == nochar2) {
            System.out.println("Both sentences have the same number of letters");
        }else {
            System.out.println("The sentences have different number of letters");
        }
        if (upperCase.equalsIgnoreCase(lowerCase) ){
            System.out.println("Both sentences are the same sentence except they are lower and upper");
        }else {
            System.out.println("the sentences are different in meaning");
        }
        System.out.println("nochar1 = " + nochar1);
        System.out.println("nochar2 = " + nochar2);




    }

}
