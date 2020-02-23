package day_36_wrapper_arraylist;
import java.util.ArrayList;
public class ArrayListIntro {
    public static void main(String[] args) {

        //declare arraylist
        ArrayList myfirstList = new ArrayList();
        //assign values using add method
        myfirstList.add("java");
        myfirstList.add("javascript");
        myfirstList.add("ruby");
        myfirstList.add("python");
        myfirstList.add("repl.it");
        myfirstList.add(1200);
        myfirstList.add(34.5);
        myfirstList.add(true);
        System.out.println("myfirstList = " + myfirstList);

        //declare arrayList that can hold only integers.

        ArrayList<Integer> numsList = new ArrayList<>();
        System.out.println("numsList = " + numsList);//before adding it is empty
        numsList.add(12);
        numsList.add(100);
        numsList.add(1);
        System.out.println("numsList = " + numsList);//after adding wou see things are added


        numsList.remove(1); //removes the data in index.
        System.out.println("numsList = " + numsList);



    }
}
