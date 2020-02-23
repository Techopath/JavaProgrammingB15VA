package day_37_arrayList;
import java.util.*;
public class SortList {
    public static void main(String[] args) {
        List<Integer>nums = new ArrayList(Arrays.asList(100,45,200,1,0,-1));

        System.out.println("nums before sorting = "+nums);

        Collections.sort(nums);
        System.out.println("nums after sorting = " + nums);

        System.out.println("-----------------------------");

        Collections.sort(nums, Comparator.reverseOrder());

        System.out.println("nums = " + nums);

        List<Character> charList = new ArrayList<>(Arrays.asList('k','u','l','o','b'));
        System.out.println("charList before sorting= " + charList);

        Collections.sort(charList);
        System.out.println("charList after sorting= " + charList);


    }
}
