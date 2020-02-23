package day_61_collections_3;

import jdk.dynalink.linker.LinkerServices;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*HashSet is a collection of unique values(elements).
* does not allow duplicates
* ordering is not allowed, you cannot use .get(i) while using loop*/
public class HashSetDemo {

    public static void main(String [] args){
        HashSet<Integer> set1 = new HashSet<>();
        Set<Integer> set2= new HashSet<>();

        set2.add(10);
        set2.add(10);
        set2.add(55);
        set2.add(66);
        set2.add(77);
        set2.add(88);
        set2.add(100);

        System.out.println(set2.toString()); //[66, 55, 88, 10, 77] Since HashSet does not allow duplicates it ignored the other value 10;

        System.out.println(set2.size());
        //System.out.println(set2.get(0)); //HashSet does not use indexes therefore we cannot use get(i).
        System.out.println(set2.contains(100)); //true

        for (int num:set2) {
            System.out.println("num = " + num);
            break;
        }

        Iterator<Integer> itSet = set2.iterator();

        System.out.println(itSet.next()); //gives the next number
        System.out.println(itSet.next());//this also give the next number

        while(itSet.hasNext()){ //iterates until itSet has the next value.
            System.out.println(itSet.next());
        }

    }
}
