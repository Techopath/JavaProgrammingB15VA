package replitExamples;
import java.util.*;


public class q183_methodsWithArrayList_size_get {

    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println(sum(ints));
    }

    public static int sum(ArrayList<Integer> ints)
    {
        //write code here
        int summation = 0;

        for (int i = 0; i < ints.size(); i++) {
            summation = summation + ints.get(i);
        }
return summation;
    }

}
