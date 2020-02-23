package day_43_constructor;
import java.util.*;
public class ComputersList {
    public static void main(String[] args) {
        //declare list of computers
        /*List<Computer> is also possible*/
       ArrayList<Computer> computerList = new ArrayList<>();
        computerList.add(new Computer("hp14","win10",219.99, 16));

        Computer c = new Computer("asus ", "winXp", 100.0,13);
        computerList.add(c);

        computerList.add(new Computer("Sony vio", "win12", 819.2,12));
        computerList.add(new Computer("MacBookPro", "MacOs", 1819.0,11));
        computerList.add(new Computer("Lenovo 44", "win11", 215.0,15));

        //todo task 1: print number of computer
        System.out.println("-------------task 1 -----------");
        System.out.println("number of computers: "+computerList.size());
        //todo task 2: print first computer brand and price
        System.out.println("---task 2 --------------");
        System.out.println(computerList.get(0));
        System.out.println(computerList.get(0).getBrand());
        Computer firstComp = computerList.get(0);
        System.out.println("brand: "+firstComp.getBrand());
        System.out.println("os: "+firstComp.getOs());
        System.out.println("price: "+firstComp.getPrice());
        System.out.println("size: "+firstComp.getSize());

        //todo task3 using for loop. print number then computer description

        for (int i = 0; i < computerList.size() ; i++) {
            System.out.println(i+1+". "+computerList.get(i).getPrice());
        }

        //todo task 4 use for each loop to to the same task above
        System.out.println("---task 4 ++++++");

        int cnt =0;
        for (Computer each:computerList) {
            cnt ++;

            System.out.println(cnt+". "+each);
            System.out.println(cnt+ ". "+each.getPrice());
        }

        double myBudget = 800.0;

        for (int i =0; i<computerList.size();i++) {
            if (computerList.get(i).getPrice() <= myBudget){
                System.out.println(computerList.get(i).getBrand() + " | "+computerList.get(i).getPrice());
            }

        }

        //todo task 6 calculate total price for all computers

        double sumTotal = 0.0;

        for (int i = 0; i < computerList.size(); i++) {

            sumTotal = sumTotal +computerList.get(i).getPrice();

        }
        System.out.println("Sum of all prices: "+sumTotal);

        // todo task 7 print information of most expensive computer
        double mostExpensiveComputer = 0.0;

        for (int i = 0; i < computerList.size(); i++) {
            if ( mostExpensiveComputer<computerList.get(i).getPrice()){
                 mostExpensiveComputer = computerList.get(i).getPrice();

            }
        }
        System.out.println("most expensive: $"+mostExpensiveComputer);



        //todo task8 print information of least expensive computer

        double leastExpensiveComputer = computerList.get(0).getPrice();
        double le = leastExpensiveComputer;

        for (int k = 0; k < computerList.size(); k++) {
            double j= computerList.get(k).getPrice();
            if (le > j){
               le = j;
            }
        }
        System.out.println("cheapest computer: $"+le );

        //todo task 9 give 50% for all prices and print them out
        double off = 50;
        for (Computer each : computerList){
            each.setPrice(each.getPrice()*(off/100));
            System.out.println(each.toString());


        }
        System.out.println("---using for loop to update the prices ----- ");
        for (int i = 0; i < computerList.size(); i++) {
            computerList.get(i).setPrice(computerList.get(i).getPrice()*(off/100));
            System.out.println(computerList.get(i).toString());
        }



    }
}
