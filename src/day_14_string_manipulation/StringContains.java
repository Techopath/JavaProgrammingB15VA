package day_14_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String list = "milk, eggs, bread, ttturkey, water, chocolate, potatoes, apples, bananaas";

        //using if statement check if "turkey" is in the list
        //if yes, print out -> "Turkey is there!' not -> we forgot turkey"
        if (list.contains("turkey")) {
        System.out.println("Turkey is there!");
        }else {
            System.out.println("We forgot turkey");
        }
        if (list.contains("banana")){
            System.out.println("Bananas are in the list");
        }else{
            System.out.println("Lets add bananas");
        }
        //check if list contains milk and store resul into hasMilk variable

        boolean hasMilk = list.contains("milk");
        System.out.println("hasmilk has " +hasMilk);
        if (hasMilk){
            System.out.println("we got the milk!");
        }
        list = list.toUpperCase();
        System.out.println(list);
        if (list.contains("WATER")){
            System.out.println("WATER is there");
        }
        //or
        boolean hasWater = list.toUpperCase().contains("WATER");
        System.out.println("WATER is there, true? Yes, "+hasWater);
    }

}
