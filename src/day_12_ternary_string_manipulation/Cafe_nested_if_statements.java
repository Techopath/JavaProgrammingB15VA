package day_12_ternary_string_manipulation;

public class Cafe_nested_if_statements {
    public static void main(String[] args) {


        String order = "food";
        String food = "sandwich";
        String drink = "soda";
        String sandwich = "veggie";
        double price = 0;
        if (order.equals("food")) {
            if (food.equals("sandwich")){
                if (sandwich.equals("veggie")){
                    price = 12;
                }else {
                    System.out.println("I dont want any other type of sandwich except veggie");
                }
            }else if (food.equals("soup")){
                price = 5;
            }else if (food.equals("salad")){
                price = 6.99;
            }else{
                System.out.println("Sorry, we dont have this food available!");
            }
        }else if (order.equals("drink")){
            if (drink.equals("soda")){
                price = 2.99;
            }else if (drink.equals("coffee")){
                price = 3.5;
            }else if (drink.equals("sprite")){
                price = 2.8;
            }else {
                System.out.println("Sorry, we dont have this drink available!");
            }

        }else {
            System.out.println("Sorry, we only have foods and drinks to order");
        }
        System.out.println("The total price for your order is $" + price);
    }
}
