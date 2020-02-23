package day_35_wrapper_classes;

import java.util.Arrays;

public class Cooking {
    public static void main(String[] args) {
        scrambledEggsRecipe();

        System.out.println("~~~~~~~~~~~~~~~~-)~~~~~~~~~~~~~~~~~");

        pastaRecipe();


    }

    public static void pastaRecipe(){
        System.out.println("~~~ DELICIOUS PASTA RECIPE ~~~");
        add("water");
        boil(1);
        add("spaghetti", "salt", "butter");
        boil(10);
        System.out.println("Pick up wooden spoon");
        mix(100);

        System.out.println("Ready - Drain water and enjoy your pasta");
    }

    public static void scrambledEggsRecipe(){
        //scrambled eggs
        System.out.println("~~~ SCRAMBLED EGGS RECIPE ~~~");
        add("oil", "eggs", "salt", "cheese", "milk");
        mix(30);
        fry(2);

        System.out.println("~~~ Enjoy your scrambled eggs ~~~");


    }
    public static void add(String ... items){
        System.out.println("Add - "+ Arrays.toString(items));

    }
    public static void mix(int seconds){
        System.out.println("Mix for "+seconds +" seconds");

    }
    public static void boil(int minutes){
        System.out.println("Boil for "+minutes+" minutes");

    }
    public static void fry(int minutes){
        System.out.println("fry for "+minutes+" minutes");

    }
    public static void bake(int minutes){
        System.out.println("Bake for "+minutes+" minutes");
    }
}
