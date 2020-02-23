package day_60_collections2;
import java.util.*;
public class IteratingCollection {
    public static void main (String[] args){
        List<String> list = new ArrayList<>();
        list.add("java"); list.add("js");list.add("html");list.add("ruby"); list.add("python");list.add("kotlin");
        /*For each loop does not allow modification
            of the collection during looping*/
        for (String str:list) {
            System.out.println(str);
            //list.remove(str);
//            list.remove(0);
//            list.add("C#");
        }

        //Iterator interface can be used to iterate
        //Declaring Iterator variable and assigning our list
        /*Iterator will point to certain value,
        * it.hasNext() -> returns true if it is pointing to a value. Returns false if it reached the end.
        * it.next() -> returns the value if it is currently pointing and moves to next value. */



        System.out.println("Using iterator hasNext() and next() methods");
        Iterator<String> it = list.iterator();

//        System.out.println(it.hasNext()); //true
//        for (int i = 0; i <list.size() ; i++) {
//            System.out.println(it.next());
//        }
//        System.out.println(it.next());//java
//        System.out.println(it.next());//js



        while (it.hasNext()){
            System.out.println(it.next());
            it.remove();
            System.out.println(list.toString());
        }
        //System.out.println(it.next()); // java.util.NoSuchElementException -> it returns exception since the loop reached the end.

        System.out.println(list.toString());//Now list is empty



    }
}
