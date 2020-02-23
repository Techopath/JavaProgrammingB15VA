package replitExamples;
import java.util.Scanner;

public class TipsCalculator_67 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        //
        System.out.println("Split or No split?");
        String split = scan.next();
        if (!split.equalsIgnoreCase("yes")){
            System.out.println("Select yes to split!");
            return;
        }
        System.out.println("Number of people: ");
        int nop = scan.nextInt();
        String numberOfPeople = "";
        for (int i = 1; i <=nop; i++) {
            numberOfPeople = numberOfPeople + "&";
        }
        //
        System.out.println("Check amount: ");
        double checkAmount = scan.nextDouble();
        //
        System.out.println("Choose quality of service and you will pay tips based on that: " +
                "\n If poor 5%, fair 10%, good 15%, great 20%, excellent 25%");
        String serviceQuality = scan.next();
        //

        double p = 0.05;
        double f = 0.10;
        double g = 0.15;
        double gr = 0.20;
        double ex = 0.25;

        double totalTip = 0;
        double totalToPay = 0;
        double totalPerPerson = 0;
        double tipPerPerson = 0;


        //tip percentage expressed in integer type


        if (split.equalsIgnoreCase("yes")) {
            if (serviceQuality.equalsIgnoreCase("poor")) {
                totalTip = p * checkAmount;
                totalToPay = totalTip + checkAmount;
                totalPerPerson = totalToPay / nop;
                tipPerPerson = totalTip / nop;
            } else if (serviceQuality.equalsIgnoreCase("fair")) {
                totalTip = f * checkAmount;
                totalToPay = totalTip + checkAmount;
                totalPerPerson = totalToPay / nop;
                tipPerPerson = totalTip / nop;
            } else if (serviceQuality.equalsIgnoreCase("good")) {
                totalTip = g * checkAmount;
                totalToPay = totalTip + checkAmount;
                totalPerPerson = totalToPay / nop;
                tipPerPerson = totalTip / nop;
            } else if (serviceQuality.equalsIgnoreCase("great")) {
                totalTip = gr * checkAmount;
                totalToPay = totalTip + checkAmount;
                totalPerPerson = totalToPay / nop;
                tipPerPerson = totalTip / nop;

            } else if (serviceQuality.equalsIgnoreCase("excellent")) {
                totalTip = ex * checkAmount;
                totalToPay = totalTip + checkAmount;
                totalPerPerson = totalToPay / nop;
                tipPerPerson = totalTip / nop;
            }
            System.out.println("Number of people entered: " + numberOfPeople);
            System.out.println("Total to pay: " + totalToPay);
            System.out.println("Total tip: " + totalTip);
            System.out.println("Total per person: " + totalPerPerson);
            System.out.println("Tip per person: " + tipPerPerson);
        }
    }

}


