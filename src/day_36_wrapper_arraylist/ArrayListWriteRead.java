package day_36_wrapper_arraylist;
import java.util.ArrayList;
public class ArrayListWriteRead {
    public static void main(String[] args) {
        //declare arrayList that can store integer values. nums
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        String str ="123";
        Integer i = Integer.valueOf(str);
        nums.add(i);
        System.out.println("nums = " + nums);
        System.out.println("nums size = " + nums.size());
        System.out.println("All values: "+nums.toString());

        //print number which is at index 0

        System.out.println("first number at index 0 : "+nums.get(0)); //this gets the number at index 0;

        //print number at index 2.
        System.out.println("number at index 2 is "+nums.get(2));
        System.out.println("number at index 3 is "+nums.get(3));
        int m = 4;
        //print number at index i
        System.out.println(nums.get(m));
        for(int n = 0; n < nums.size(); n++){
            System.out.println(nums.get(n));
        }
///
        Integer a = nums.get(3);
        if (a%2 ==0){
            System.out.println("it is even number");

        }else{
            System.out.println("odd number");
        }

    }
}

