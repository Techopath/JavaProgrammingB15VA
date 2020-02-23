package day_12_ternary_string_manipulation;

public class Cafe {
    public static void main(String[] args) {
        //This program prints out the order from a Cafe offering food and drinks.
        /*String order = "drink" + "food";
        String drink = "soda" + "coffee" + "water";
        String food = "sandwich" + "soup" + "salad";
        */
        String order= "drink";
        String drink = "soda";
        String food = "sandwich";
        double soda = 1.90;
        double coffee = 4.99;
        double water = 1.55;
        double sandwich = 7.45;
        double soup = 6.33;
        double salad = 9.99;
        double price = 0;
    if (order.equals("drink") && drink.equals("soda")){
        price = soda;
    }else if (order.equals("drink") && drink.equals("coffee")){
        price = coffee;

    }else if (order.equals("drink") && drink.equals("water")){
        price = water;
    }else if (order.equals("food") && food.equals("sandwich")){
        price =sandwich;

    }else if (order.equals("food") && food.equals("soup")){
        price = soup;
    }else if(order.equals("food") && food.equals("salad")){
        price = salad;
    }else {
        System.out.println("Sorry, we dont have the item available!");

    }
        System.out.println("Total Price is $" + price );

    }
}

