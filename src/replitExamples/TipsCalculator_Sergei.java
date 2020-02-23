package replitExamples;
import java.util.*;
public class TipsCalculator_Sergei {
    public static void main(String[] args) {


        //WRITE YOUR CODE HERE
        Scanner scan = new Scanner(System.in);
        System.out.println("Split:");
        String Split = scan.next();
        System.out.println("Number of people:");
        int number = scan.nextInt();
        System.out.println("Check amount:");
        int checkAmount = scan.nextInt();
        System.out.println("Service Quality:");
        String serviceQuality = scan.next();
        String totalpeople = "";
        if (Split.equalsIgnoreCase("Yes")) {
            for (int n = 1; n <= number; n++) {
                totalpeople += "&";
            }
            System.out.println("Number of people entered: " + totalpeople);
            double totalTip = 0;
            switch (serviceQuality) {
                case "Excellent":
                    totalTip = checkAmount * 0.25; //checkAmount * (25/100)
                    break;
                case "Great":
                    totalTip = checkAmount * 0.2;
                    break;
                case "Good":
                    totalTip = checkAmount * 0.15;
                    break;
                case "Fair":
                    totalTip = checkAmount * 0.1;
                    break;
                case "Poor":
                    totalTip = checkAmount * 0.05;
                    break;
            }
            double totalToPay = checkAmount + totalTip;
            double totalToPayPerPerson = 0;
            double totalTipPerPerson = 0;
            if (Split.equalsIgnoreCase("yes")) {
                totalToPayPerPerson = totalToPay / number;
                totalTipPerPerson = totalTip / number;
            } else if (Split.equalsIgnoreCase("no")) {
                totalToPayPerPerson = totalToPay;
                totalTipPerPerson = totalTip;
            } else {
                System.out.println("Please enter yes or no");
            }

            System.out.println("Total to pay: " + totalToPay);
            System.out.println("Total tip: " + totalTip);
            System.out.println("Total per person: " + totalToPayPerPerson);
            System.out.println("Tip per person: " + totalTipPerPerson);
        }
    }
}

