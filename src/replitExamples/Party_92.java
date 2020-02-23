package replitExamples;
import java.util.*;
public class Party_92 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // your code
        // ------------------------------------------

        System.out.println("Please enter guest name:");
        String guestName = input.nextLine();
        System.out.println("Do you want to enter new guest name:");
        String ifYes = input.nextLine();


        String allGuests = guestName+" ";

            while(ifYes.equalsIgnoreCase("yes")){
                System.out.println("Please enter guest name:");

                String otherGuests = input.nextLine();
                allGuests = allGuests+otherGuests +" ";

                System.out.println("Do you want to enter new guest:");
                ifYes = input.nextLine();


            }


        System.out.println(allGuests);






    }
}
