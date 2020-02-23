package day_37_arrayList;
import java.util.*;
public class ArrayListMethods2 {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();
        System.out.println("//check if list is empty");
        System.out.println("IsEmpty() - "+shoppingList.isEmpty());
        System.out.println("size() ==0 -"+(shoppingList.size() ==0));
    if (shoppingList.isEmpty()){
        System.out.println("List is empty, nothing to buy. Keep coding java");

    }else{
        System.out.println("List is not emty. code java and then go to mall");
    }

    shoppingList.add("Apple laptop");
    shoppingList.add("charger");
    shoppingList.add("gift for friend");
    shoppingList.add("needle");
    shoppingList.add("coffee");
    shoppingList.add("hat");
    shoppingList.add("wooden spoon");

        System.out.println(shoppingList.toString());

        //check if shopping list is still empty
        if (shoppingList.isEmpty()){
            System.out.println("List is empty, nothing to buy. Keep coding java");

        }else{
            System.out.println("List is not emty. code java and then go to mall");
        }


        //check if hat is among the items
        //use contains method

        System.out.println("List.contains(hat)"+shoppingList.contains("hat"));
        if (shoppingList.contains("hat")){
            System.out.println("H/at is on the list. buy it and go fast to code java");
        }else{
            System.out.println("hat is not on list. keep coding");
        }

        System.out.println("5 in list - "+shoppingList.contains(5));
        System.out.println("celphone - "+shoppingList.contains("celphone"));

        //find index of "TESLA" and "apple laptop", "hat"
        System.out.println("index of hat - "+shoppingList.indexOf("hat")+"\nindex of apple laptop - "+shoppingList.indexOf("Apple laptop"));
    }

}
