package day_39_list_practice_custom_classes;
import day_09_multibranch_switch.Citizens_if_statement;

import java.util.*;

public class ProductsCatalog {
    public static void main(String[] args) {
//        ArrayList<String> items = new ArrayList<>(Arrays.asList("iPhone 6s", "iPhone 6s Plus", "iPhone X", "MacBook Pro", "ThumbDrive", "Beats HeadPhones", "Mouse", "Charger", "iPad", "Dyson Vacuum", "TV", "Apple Watch"));
//        ArrayList<Double> price = new ArrayList<>(Arrays.asList(449, 549, 1149, 1499.99, 39.99, 39.99, 79.99, 39.99, 429, 399, 2199, 559));
//        ArrayList<Double> monthly = new ArrayList<>(Arrays.asList(18.71, 22.88, 56.16, 79.49, 2.68, 15.12, 8.98, 4.56, 18.31, 16.25, 89.49, 21.18));
        List<String> items = new ArrayList<>();
        items.add("IPhone 6s");
        items.add("IPhone 6s Plus");
        items.add("IPhone X");
        items.add("MacBook Pro");
        items.add("ThumbDrive");
        items.add("TV");
        items.add("Mouse");
        items.add("Charger");
        items.add("iPad");
        List<Double> prices = new ArrayList<>();
        prices.add(499.0);
        prices.add(549.0);
        prices.add(1149.);
        prices.add(10.99);
        prices.add(39.99);
        prices.add(39.99);
        prices.add(549.0);
        prices.add(549.0);
        prices.add(100.99);
        List<Double> monthlyPayments = new ArrayList<>();
        monthlyPayments.add(18.71);
        monthlyPayments.add(22.88);
        monthlyPayments.add(56.16);
        monthlyPayments.add(18.71);
        monthlyPayments.add(18.71);
        monthlyPayments.add(18.71);
        monthlyPayments.add(18.71);
        monthlyPayments.add(18.71);
        monthlyPayments.add(20.5);
        System.out.println(items);
        System.out.println(prices);
        System.out.println(monthlyPayments);
//        System.out.println(items.size());
//        System.out.println(prices.size());
//        System.out.println(monthlyPayments.size());
        //TODO TASK 1 PRINT ALL THE CATALOG []
        for (int i = 0; i < items.size(); i++) {
            System.out.println(i + 1 + ". [" + items.get(i) + " - " + prices.get(i) + " - " + monthlyPayments.get(i) + "]");
        }

        /*
        //todo task 2 Declare String arraylist wholeCatalog and add all items info to it by concatinating it.
           [IPhone 6s - 499.0 - 18.71]
           [IPhone 6s Plus - 549.0 - 22.88]
         */

        ArrayList<String> wholeCatalog = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            wholeCatalog.add("[" + items.get(i) + "-" + prices.get(i) + "-" + monthlyPayments.get(i) + "]");
        }
        System.out.println("wholeCatalog = " + wholeCatalog);

        /*
        todo task 3. string item = "Dyson vacuum"
        look for the item in the items list, then print it out in this format: Dyson Vacuum|3.4|45

         */
        System.out.println();
        String item = "Charger";
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(item)) {
                System.out.println("Found: " + items.get(i) + "|" + prices.get(i) + "|" + monthlyPayments.get(i));
            } else {
                System.out.println("not found");
            }
        }
        System.out.println();
        //this way also possible
        String it = "iPhone X";
        if (items.contains(it)) {
            int index = items.indexOf(it);

            System.out.println(it + "|" + prices.get(index) + "|" + monthlyPayments.get(index));
        } else {
            System.out.println(it + " not found. Keep coding Java!");
        }

        /*
        todo task 4. updatePrice for item
        String product = "Tv ;
        double newPrice = 1099.0;
        finfd the product index in items, then update the price in prices list.

         */

//Murodilscode
        String product = "TV";
        double newPrice = 1099.0;
        if (items.contains(product)) {
            int idx = items.indexOf(product);
            System.out.println(product + " was found at index " + idx);
            prices.set(idx, newPrice);//update the price to newPrice
            monthlyPayments.set(idx, newPrice / 18);
            System.out.println(items.get(idx) + " new price : " + prices.get(idx));
            System.out.println("new monthly payment: " + monthlyPayments.get(idx));
        } else {
            System.out.println(product + " is not found! Keep coding java!");
        }
        System.out.println(prices);


//        String product = "iPad";
//        double newPrice = 1099.0;
//        System.out.println();
//        int idx =0;
//        for (int i = 0; i < items.size(); i++) {
//
//            if (items.get(i).equals(product)){
//                System.out.println(items.get(i)+" found: ");
//                idx = items.indexOf(product);
//                prices.set(idx, newPrice);
//            }else{
//                System.out.println(items.get(idx)+" not found ");
//            }
//
//        }
//        System.out.println();
//
//        System.out.println("updated price list: "+prices);

//        System.out.println("slack from --- Hamed");
//        String prt = "iPad";
//        double np = 1099.0;
//        for (int i =0; i<items.size(); i++){
//            if (items.get(i).contains(prt)){
//                prices.set(i, np);
//                System.out.println("price updated successfully");
//                System.out.println("the new price is: "+prices.get(i));
//                return;   }
//           }
//
//        System.out.println("item is not founddd! keep coding java!");
//

        /*
        todo: task5 delete item from catalog
        String prodToDelete = "ThumbDrive";
        Find the index of prodToDelete and remove it from items, prices, monthlypayments.

        if done
        print "ThumDrive deleted successfully"
        else
        System.out,println("item not found")
         */
        System.out.println("---------removes the element----------");
        String prodToDelete = "ThumbDrive";

        if (items.contains(prodToDelete)) {

            int indexToDelete = items.indexOf(prodToDelete);

            System.out.println(prodToDelete + " found at index " + indexToDelete);

            items.remove(indexToDelete);
            prices.remove(indexToDelete);
            monthlyPayments.remove(indexToDelete);
            System.out.println(prodToDelete + " still there? - " + items.contains(prodToDelete));

        } else {
            System.out.println(prodToDelete + " not fount the item");
        }
        System.out.println("items = " + items);

        /*
        todo : remove all iphones from all lits.
         */
        System.out.println("before the change item size is  = " + items.size());
        String iphone = "IPhone";
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).startsWith(iphone)) {
                items.remove(items.get(i).startsWith(iphone));

                System.out.println("items = " + items);
                System.out.println("after we removed items = " + items.size());

            }
        }

        //
//        System.out.println("------the other way------------");
//        ArrayList<String> array = new ArrayList<>();
//
//        for (int i = 0; i < items.size(); i++) {
//            if (!items.get(i).toLowerCase().contains("iphone")){
//
//                array.add(items.get(i));
//
//            }
//        }
//        System.out.println(array);
//        System.out.println("removeIf");
//        items.removeIf(prod -> prod.toLowerCase().contains("iphone"));
//        System.out.println(items);
//        System.out.println(prices);
//        System.out.println(monthlyPayments);

        System.out.println("----------------");
        System.out.println("==== TASK 6 REMOVE all the iphones=======");
        String deleteIphone = "IPhone";
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).contains(deleteIphone)) {
                items.remove(i);
                prices.remove(i);
                monthlyPayments.remove(i);
                i--;
            }
        }


        System.out.println(items);
        System.out.println(prices);
        System.out.println(monthlyPayments);
        System.out.println("-------------------");

        System.out.println("----from amir");
        for (int i = items.size() - 1; i >= 0; i--) {
            if (items.get(i).startsWith("IPhone"))
                items.remove(i);
        }
        System.out.println(items);

        System.out.println("prices less than ...");

        for (int i = 0; i < prices.size(); i++) {
            if (prices.get(i) < 550) {
                System.out.println(items.get(i) + " - " + prices.get(i) + " - " + monthlyPayments.get(i));
            }
        }

        /*
        todo: task 8 find the most expensive item and print all info about it.
         task 9: find the cheapest item too.
         */
        System.out.println(prices);
        System.out.println("--expensive item");
        double expensive = 0.0;
        for (int i = 0; i < prices.size(); i++) {
            if (expensive < prices.get(i)) {
                expensive = prices.get(i);
            }
        }
        System.out.println(expensive + " -- ");


        System.out.println(" --cheapest item---");

        double cheapest = prices.get(0);
        String cheapestItem = "";

        for (int i = 0; i < prices.size(); i++) {
            if (cheapest >= prices.get(i)) {
                cheapest = prices.get(i);
                cheapestItem = items.get(i);
                double cheapestMonthly = monthlyPayments.get(i);
                System.out.println(cheapestItem + " -- " + cheapest + " -- " + cheapestMonthly);
            }
        }
        System.out.println("cheapest item: " + cheapestItem);
        System.out.println(cheapestItem + " -- " + cheapest + " -- ");

        // 8. find the most expensive item and print out  ( MacBook pro)
        int max = 0;
        for (int i = 0; i < prices.size(); i++) {
            if (prices.get(i) > prices.get(max)) {
                max = i;
            }
        }
        System.out.println(items.get(max) + " - " + prices.get(max) + " - " + monthlyPayments.get(max));
        System.out.println();
// 9. find the least expensive item and print out  (charger)
        int min = 0;
        for (int i = 0; i < prices.size(); i++) {
            if (prices.get(i) < prices.get(min)) {
                min = i;
            }
        }
        System.out.println(items.get(min) + " - " + prices.get(min) + " - " + monthlyPayments.get(min));
        System.out.println();

        int[] nums = {10, 4, 5};
        System.out.println(nums.toString()); //gives hashcode =>[I@4bf558aa
        System.out.println(Arrays.toString(nums));

        List<String>[] hi = new List[4];
        hi[0] = new ArrayList<>();

        hi[0].add("a");
        System.out.println(hi.toString());

        List<String[]> myList = new ArrayList<>();
        String[] strArray = {"hello", "java"};

    }
}


