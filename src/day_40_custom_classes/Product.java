package day_40_custom_classes;

import day_04_math_operators_scanner.EtsyItem;

public class Product {
    /*
    product properties/attributes:
    - string title
    - double price
    - int rating
    - string seller
     //we use it as a template blueprint for upcoming classes.
     we declare them in the class but outside any method.
     */


    String title;//"wooden spoon";
    double price;//14.99;
    int rating;//5
    String seller;//"Memento";
    boolean bestSeller;
    boolean freeShipping;

    //custom method to act as behaviour for Product class.

    public void displayInfo(){
        System.out.println("----Product Info ---------");
        System.out.println("title = "+ title);
        System.out.println("price = $"+price);
        System.out.println("rating = "+ rating);
        System.out.println("seller = "+seller);
        System.out.println("best seller = "+bestSeller);
        System.out.println("free shipping = "+freeShipping);
    }

    //we can add a main method in same class and add object to it.

    public static void main(String[] args) {
        Product prod1 = new Product();
        prod1.title = "spoon";
        prod1.price = 5.6;
        prod1.rating = 5;
        prod1.seller = "Mr.Who";
        prod1.bestSeller = true;
        prod1.displayInfo(); //we can call the method here too

        //how to read values from object

        System.out.println("prod1 object title "+prod1.title);
        System.out.println("prod1 object price "+prod1.price);
        System.out.println("prod1 object rating "+prod1.rating);
        System.out.println("prod1 object seller "+prod1.seller);
        System.out.println("prod1 object bestSeller "+prod1.bestSeller);


    }


}
