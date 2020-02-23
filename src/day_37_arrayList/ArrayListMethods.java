package day_37_arrayList;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class ArrayListMethods {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("McLean");
        cities.add("Alexsandria");
        cities.add("Reston");
        cities.add("Fairfax");
        cities.add("Baku");
        cities.add("Kabul");
        cities.add("Tashkent");
        cities.add("Istanbul");
        cities.add("Dushanbe");
        cities.add("Tehran");
        cities.add(0, "Calamba");
        cities.add(1,"Muminobod");
        cities.add("Mars");


        System.out.println("cities = " + cities);

        cities.add(2,"Yerevan");
        System.out.println("cities = " + cities);

        //

        cities.set(4,"Sterling");
        System.out.println("cities = " + cities);

        System.out.println(cities.toString());

        System.out.println(" //remove element/value at index 3. ");

        cities.remove(3);
        System.out.println(cities.toString());

        System.out.println("//remove certain city");
        cities.remove("Baku");
        System.out.println(cities.toString());



    }

}
