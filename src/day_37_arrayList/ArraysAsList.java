package day_37_arrayList;
import java.util.*;
public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,40,12,5,7);//using as list it will be fixed size. you cannot add to it anything
       // nums.add(15); //not working when we tr to add
        System.out.println(nums.toString());

        List<Integer> nums2 = new ArrayList(Arrays.asList(10,40,12,5,7));

        System.out.println("nums2 = " + nums2);
        nums2.add(2020);
        nums2.add(2019);
        nums2.add(10);
        System.out.println("nums2 = " + nums2);

     }
}
