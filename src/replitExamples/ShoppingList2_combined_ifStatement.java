package replitExamples;
import java.util.Scanner;
public class ShoppingList2_combined_ifStatement {
        public static void main(String[] args) {

            //WRITE YOUR CODE HERE:
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter item1, count and its price:");
            String item1 = scan.next();
            int count1 = scan.nextInt();
            double price1 = scan.nextDouble();
            double totalPrice1 = price1*count1;
            String report = "";

            System.out.println("Enter Item2, count and its price: ");
            String item2 =scan.next();
            int count2 = scan.nextInt();
            double price2 = scan.nextDouble();
            double totalPrice2 = price2*count2;

            System.out.println("Enter Item3, count and its price: ");
            String item3 =scan.next();
            int count3 = scan.nextInt();
            double price3 = scan.nextDouble();
            double totalPrice3 = count3*price3;
            if (count1 == 0 && count2 ==0 && count3 ==0 ) { //if one or all false the result will be false
                report = "";
            }else {
                report = "Item1: " +item1 + " Price: " +totalPrice1+" Item2: " +item2 + " Price: " +totalPrice2 + " Item3: " +item3 + " Price: " +totalPrice3;
            }
            double wholePrice = totalPrice1 + totalPrice2 +totalPrice3;
            System.out.println(report + "\nTotal Price: " + wholePrice);
        }
}


