package replitExamples;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
public class q95 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String shoppingListReport = "";
            String item = "";
            String countinue = "";
            double price = 0;
            int count = 1;
            double totalPrice = 0;
            System.out.println("Enter item"+count+" and its price: ");
            item = scan.next();
            price = scan.nextDouble();
            shoppingListReport = shoppingListReport + "Item"+count+": "+item +" Price:"+price+", ";

            totalPrice = totalPrice + price;

            System.out.println("Add one or more item?");
            countinue = scan.next(); //type yes or no if asked in the console

            if (countinue.equals("yes")){
                do{
                    count ++;
                    System.out.println("Enter item"+count+" and its price: ");
                    item = scan.next();
                    price = scan.nextDouble();
                    shoppingListReport = shoppingListReport + "Item"+count+": "+item +" Price:"+price+", ";

                    totalPrice = totalPrice + price;
                    System.out.println("Add one or more item?");
                    countinue = scan.next(); //type yes or no if asked in the console
                    if(countinue.equals("no")){
                        shoppingListReport = shoppingListReport.substring(0, shoppingListReport.length()-2);

                        System.out.println(shoppingListReport +"\nTotal price: "+totalPrice);
                    return;
                    }

                } while(count<=10);





            }else{
                shoppingListReport = shoppingListReport.substring(0, shoppingListReport.length()-2);

                System.out.println(shoppingListReport +"\nTotal price: "+totalPrice);
            }


        }
    }

