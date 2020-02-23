package replitExamples;


import java.util.*;

public class FindAUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Full name: ");
        String fullName = scan.nextLine();
        String fn = "Max Payne";
        String sn = "Alan Wake";
        if (fullName.equalsIgnoreCase(fn)){
            System.out.println("User Found!");
        }else {
            System.out.println("User not found");
        }

    }



}
