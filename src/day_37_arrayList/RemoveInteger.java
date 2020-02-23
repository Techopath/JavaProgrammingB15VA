package day_37_arrayList;
import java.util.ArrayList;
public class RemoveInteger {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(5);
        nums.add(4);
        nums.add(6);
        nums.add(7);
        nums.add(7);
        nums.add(9);
        nums.add(0);
        nums.add(1);
        nums.add(1);
        nums.add(2);
        System.out.println("nums.size() = " + nums.size());

        System.out.println("remove number from index 0");

        nums.remove(0);
        System.out.println(nums);
        System.out.println("remove value - 2 and print again");
        nums.remove(Integer.valueOf(2));
        nums.remove(new Integer(7));

        //create an integer wrapper object with value of 11

        Integer n = Integer.valueOf(11); //create wrapper object

        nums.add(n);
        System.out.println("nums = " + nums);

    }

}
