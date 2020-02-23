package day_61_collections_3;
import java.util.*;
public class HashMapDemo {

    public static void main(String[] args) {
        //  Key   , Value
        Map<String, Double> items = new HashMap<>();
        items.put("potatoes", 0.99); //eliminates duplicates.
        items.put("potatoes", 2.99);
        items.put("eggs", 2.6);
        items.put("cheese", 3.5);
        items.put("strawberries", 7.99);
        items.put("pizza", 13.9);
        items.put("cat food", 18.0);
        items.put("apples ", 3.99);
        items.put("cookies", 4.69);
        items.put("milk", 2.45);
        System.out.println(items.toString());//{eggs=2.6, potatoes=2.99, pizza=13.9, milk=2.45, strawberries=7.99, cat food=18.0, cookies=4.69, cheese=3.5}

        System.out.println("Price of eggs: "+items.get("eggs"));
        System.out.println(items.get("strawberries"));
        System.out.println(items.get("milk"));

        System.out.println("items: "+items.keySet()); //gets all keys in Set format
        System.out.println("prices: "+items.values()); //gets all values in Collection

        for (String key:items.keySet()){
            System.out.print("key = "+key);
            System.out.println(", value= "+ items.get(key));

        }

    }
}
