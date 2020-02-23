package day_44_static;
import java.util.*;
import java.util.Arrays;
import java.util.List;

public class StarBucks {

    /*todo create a method:
       Method: drinkCoffee
       param: Coffee coffeeObj
       return void
       Drinking and enjoying coding java
       ex: drinkCoffee()

      */


    public static void drinkCoffee(Coffee coffeeObj){

        System.out.println("Drinking "+coffeeObj.getName()+ " and enjoying coding java");

    }






    /* todo
    *  Method: orderCoffee
    * param: String coffeeName, String coffeeSize
    * return Coffee
    * Create coffeeObj using coffeeName, coffeeSize, 43.99
    * and retun from method
    *
    * */


    public static Coffee orderCoffee(String coffeeName, String coffeeSize){
        System.out.println("Preparing "+coffeeSize+" "+coffeeName);
        Coffee readyCoffee = new Coffee(coffeeName, coffeeSize, 0.99 );
        return readyCoffee;
    }


    public static void main(String[] args) {
        Coffee cappuccino = new Coffee("Cappuccino", "grande", 3.99);
        cappuccino.drink();
        System.out.println(cappuccino.toString());

        System.out.println(" //syntax for array of Coffees");

        Coffee [] coffeesArray = new Coffee[2];

        coffeesArray[0] = new Coffee( "Cappuccino ", "grande", 3.99);
        //or
        coffeesArray[0] = cappuccino;
        coffeesArray[1] = new Coffee("Latte", "venti", 5.99);

        System.out.println(Arrays.toString(coffeesArray));//print out type for arrays

        System.out.println("//ArraysList of Coffees");
        List<Coffee> coffeeList = new ArrayList<>();
        coffeeList.add(cappuccino);
        coffeeList.add(coffeesArray[1]);
        coffeeList.add(new Coffee("Nitro Brew", "venti", 5.99 ));

        System.out.println(coffeeList.toString());
        System.out.println("//Drink first coffee");
        coffeeList.get(0).drink();

        System.out.println("//Drink all of them");


        for (Coffee eachCoffee: coffeeList) {

            eachCoffee.drink();
        }

        System.out.println("---------------call custom method drinkCoffee---------------");
        Coffee hotChocolate = new Coffee("Hot Chocolate", "venti", 4.99);

        // call the method and pass the Coffee obj

        drinkCoffee(hotChocolate);
        drinkCoffee(cappuccino);
        drinkCoffee(new Coffee("Mocha", "tall", 2.33));

        System.out.println("----call method orderCoffee ------");

        Coffee myCoffee = orderCoffee("white Mocha", "tall");

        myCoffee.drink();
        System.out.println(myCoffee.toString());

        Coffee myVentiLatte = orderCoffee("vanilla", "venti");

        myVentiLatte.drink();



    }

}
