package day_27_arrays_day6;

import javax.swing.plaf.basic.BasicSplitPaneUI;

public class MallShopping {
    public static void main(String[] args){
        String [] items = {"Shoes", "Jacket", "Gloves","Air-pods", "iPad", "iphone 11 case"};
        double [] prices = {120, 150.0, 9.99, 500.0, 439.50, 20.0};
        int [] itemsIDs = {12345, 12346, 12347, 12348, 12349, 12350};
        ////task1 check all three arrays length are the same

       if (items.length == prices.length && items.length == itemsIDs.length){
            System.out.println(true);


        }else {
           System.out.println(false);
           return;
       }
       //task 2 how many items purchased
        System.out.println("Number of purchased items: "+items.length);
       //task3 print a receipt report

        /*
        12345 - shoes -$99.9
        ....

        total price : $458.8 (include tax)
         */
        double sum =0;
        for (int i = 0; i < prices.length; i++) {
            sum = sum+prices[i];
            System.out.println(itemsIDs[i]+"-"+items[i]+"-$"+prices[i]);

        }
        double tax = sum*0.06;
        System.out.println("tax amount: "+tax+"\nTotal price: $"+sum+"(including tax)");

        //task4 find air-pod and print along with price and itemsId
        System.out.println();

        for (int d = 0; d < items.length; d++) {
            if (items[d].equalsIgnoreCase("air-pods")){
                System.out.println(itemsIDs[d]+"-"+items[d]+"-$"+prices[d]);
            }
        }
        //task 5. find the most expensive item and print out the details
        System.out.println();
        // double [] prices = {99.99, 150.0, 9.99, 500.0, 439.50, 1000.0};
        double max =0;
        String itemname = "";
        String itemid = "";
        for (int t = 0; t <prices.length; t++) {
            if (max<prices[t]){
                max = prices[t];
                itemname = items[t];
                itemid = itemsIDs[t]+"";

            }


        }
        System.out.println(itemid+"-"+itemname+"-"+max);
//012345


        System.out.println();
        double min = prices[0];
        System.out.println(min);
        for (int h = 1; h < prices.length; h++) {

            if (min>prices[h]){
                min = prices[h];
            }


        }
        System.out.println(min);

        //print out the prices which are more expensive than the average
        System.out.println();
        double total = 0;
        double average =0;
        for (int element = 0; element < prices.length; element++) {
            total =total+ prices[element];
            average =total/prices.length;

            System.out.println("average"+average);
            //System.out.println(total);
        }
        for (int i = 0; i < prices.length; i++) {
            if (prices[i]>average){
                System.out.println(" "+prices[i]);
            }


        }






        }
    }
