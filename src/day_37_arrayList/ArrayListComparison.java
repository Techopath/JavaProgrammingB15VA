package day_37_arrayList;
import java.util.*;
public class ArrayListComparison {
    public static void main(String[] args) {
        List<Double> list1 = new ArrayList<>();
        list1.add(1.2);
        list1.add(5.2);
        list1.add(7.5);
        list1.add(8.);
        list1.add(52.5);

        //refer/point list2 to same object as list1

        List<Double> list2 = list1;

        System.out.println("list1 == list2 -"+ (list1 == list2));

        System.out.println(list1);
        System.out.println(list2);

        list1.add(100.0);
        System.out.println("add value to list1");
        System.out.println(list1);
        System.out.println(list2);
//        list2.add(2.2);
//        System.out.println("add value to list2");
//        System.out.println(list1);
//        System.out.println(list2);

        List<Double> list3 = new ArrayList<>();
        list3.add(1.2);
        list3.add(5.2);
        list3.add(7.5);
        list3.add(8.);
        list3.add(52.5);
        list3.add(100.0);

        System.out.println("list1 == list3 -"+(list1 == list3)); //list1 and list3 are pointing to different objects in memory. therefore
        //printing out false despite the data are the same for both lists

        System.out.println("list1.equals(list3)- " +(list1.equals(list3))); //check values index by index.
        //if we change the indexes but all the data are the same, still it will give error.
        System.out.println("list1.equals(list2)"+list1.equals(list2));
        System.out.println("list3.equals(lis2)"+list3.equals(list2));
        list3.add(5.1);
        System.out.println("list1.equals(list3)- " +(list1.equals(list3)));//we added another double to list3

        List<Integer>listA = new ArrayList<>();
        listA.add(30);
        listA.add(10);
        listA.add(11);
        List<Integer> listB = new ArrayList<>();
        listB.add(30);
        listB.add(10);

        System.out.println("listA -> "+listA.toString());
        System.out.println("listB -> "+listB.toString());

        System.out.println("ListA == listB > "+(listA.equals(listB)));

        System.out.println("lista.contains(listB) -> "+listA.containsAll(listB));

        /*
        remove all elements from listA that matches listB
         */
        listA.removeAll(listB);
        System.out.println("listA -> "+listA);
        System.out.println("ListB->"+listB);
        listB.removeAll(listB);
        System.out.println("listB -> "+listB);

    }
}
