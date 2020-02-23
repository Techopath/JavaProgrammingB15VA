package replitExamples;
import java.util.Scanner;
public class patientInformation {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the patient portal! \n Please enter your personal information");
        System.out.println("Enter your first name");
        String firstName =scan.next();
        System.out.println("Enter your last name");
        String lastName = scan.next();
        System.out.println("Enter your email");
        String email = scan.next();
        System.out.println("Enter your street");
        String street = scan.next();
        System.out.println("Enter your city");
        String city = scan.next();
        System.out.println("Enter your state");
        String state = scan.next();
        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();
        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println("Enter your height");
        double height = scan.nextDouble();
        System.out.println("Enter your weight");
        double weight = scan.nextDouble();
        System.out.println("Enter your work phone");
        long workPhoneNumber = scan.nextLong();
        System.out.println("Enter your personal phone number");
        long personalPhoneNumber = scan.nextLong();
        System.out.println("Are you married?");
        boolean isMarried = scan.nextBoolean();
        String address = street + city + state + zipCode;
        String fullName = lastName +", " +firstName;
        String contacts = "work phone number -" + workPhoneNumber +", personal phone number - " + personalPhoneNumber +", email: " + email;
        System.out.println("Patient personal information"+ "\nFull name: " +fullName + "\nAddress: " + address + "\nContacts: " + contacts
        + "\nAge: " +age + "\nHeight: " +height + "\nWeight: " +weight + "Married?: " + isMarried);


    }


}
