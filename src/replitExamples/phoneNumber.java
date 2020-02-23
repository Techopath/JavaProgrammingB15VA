package replitExamples;

import java.util.Scanner;
public class phoneNumber {
    //YOUR CODE HERE
    public static void main(String [] args ){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter areaCode and localNumber ");
        int areaCode = input.nextInt();
        int localNumber = input.nextInt();
        String phoneNumber = "("+areaCode+")-" +localNumber;
        System.out.println("Calling number " + phoneNumber);
    }


}