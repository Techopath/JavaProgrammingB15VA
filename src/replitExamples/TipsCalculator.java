package replitExamples;
import java.util.*;
public class TipsCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //
        System.out.println("Split or No split?");
        String word2 = scan.next();
        //
        System.out.println("Number of people: ");
        int nop = scan.nextInt();
        //
        System.out.println("Check amount: ");
        double checkAmount = scan.nextDouble();
        //
        System.out.println("Choose quality of service and you will pay tips based on that: " +
                "\n If poor 5%, fair 10%, good 15%, great 20%, excellent 25%");
        String word = scan.next();


        //tip percentage expressed in integer type
        double p = 0.05;
        double f = 0.10;
        double g = 0.15;
        double gr = 0.20;
        double ex = 0.25;
        //check amount
        double totalTip = ex*checkAmount;

        double totalToPay =  checkAmount + totalTip;
        double totalPerPerson = totalToPay/nop;
        double tipPerPerson = totalTip/nop;



        if (word2.equalsIgnoreCase("yes") && word.equalsIgnoreCase("excellent")){

            System.out.println("Number of people entered: " +nop);
            System.out.println("Total to pay: " + totalToPay);
            System.out.println("Total tip: " +totalTip);
            System.out.println("Total per person: " + totalPerPerson);
            System.out.println("Tip per person: "+ tipPerPerson);
        }else if (word2.equalsIgnoreCase("yes") && word.equalsIgnoreCase("poor")){

        }
        else {
            System.out.println("Please choose to split and select service quality!");
        }



    }
}
