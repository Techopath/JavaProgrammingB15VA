package day_61_collections_3;
import java.util.*;
public class CitiesHashSet {

    public static void main(String[] args) {
        Set<City> citySet = new HashSet<>();
        City c1 = new City("Calamba");
        City c2 = new City("Calamba");
        City c3 = new City("Urumchi");
        City c4 = new City("Dushanbe");
        City c5 = new City("Qashgar");
        City c6 = new City("Fairfax");

        citySet.add(c1);
        citySet.add(c2);
        citySet.add(c3);
        citySet.add(c4);

        System.out.println(citySet.size());
        System.out.println(citySet.toString()); //in order not to include duplicate cities,  we go to City class and generate equals() and HashCode () methods


        //in order to find unique values the simplest way is to throw the bunch of data into a hashSet.

        List<Integer> numsList = new ArrayList<>();
        numsList.add(10);
        numsList.add(10);
        numsList.add(100);
        numsList.add(100);
        numsList.add(100);

        Set<Integer> numsSet = new HashSet<>(numsList);
        System.out.println("numsList = " + numsList);
        System.out.println("numsSet = " + numsSet);



    }
}
