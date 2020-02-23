package day_61_collections_3;
import java.util.*;
/*Sorted set is an interface that extends Set interface. It has one implementing class which is TreeSet.
 * TreeSet features:
 * 1. */
/*when we say Set, the first thing that should come to mind is Collection of unique values.
*
* HashSet -> it does not keep insertion order
*         -> does not sort.
* ->  does not have index values.
* LinkedSet => Keeps insertion order
*           => does not sort.
* =>  does not have index values.
*
* TreeSet _> Automatically sorts in ascending order.
* _>  does not have index values.
*
* Remember: Set implementing classes (or Sets ) does not have index values. */

public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet<Double> treeSet = new TreeSet<>();
        //or we can use polymorphism approach and
        //Set<Double> myTreeSet = new TreeSet<>(); //we can use Set too.
        SortedSet<Double> myTreeSet = new TreeSet<>();
        myTreeSet.add(555.2);
        myTreeSet.add(555.2);
        myTreeSet.add(0.0);
        myTreeSet.add(5.0);
        myTreeSet.add(15.0);
        System.out.println(myTreeSet.size());//4
        System.out.println(myTreeSet.toString());  // [0.0, 5.0, 15.0, 555.2]

    }
}
