package day_24_arrays_day3;
import java.util.*; //this import is important to be here when dealing with arrays methods
public class ArraysEquals {
    public static void main(String[] args) {
        int[] nums1 ={4,5,2,10};
        int[] nums2 ={4,5,2,10};
        int[] nums3 ={10,4,5,2};
        int[] nums4 ={4,5,2,10, 90};
        int[] nums5 ={54, 23, 54, 123, 54};
        System.out.println("nums1 == nums2 >"+Arrays.equals(nums1, nums2));
        System.out.println("nums1 == nums2 >" + (nums1 == nums2)); //this gives false despite it is true. it is not comparing data inside.
        Arrays.sort(nums3);
        Arrays.sort(nums2);




        boolean bool1 = Arrays.equals(nums2,nums3);
        System.out.println(bool1);

        //Arrays.equals(nums1, nums2) && Arrays.equals(nums1,nums3);

        String [] cars1 = {"Toyota","Honda", "Tesla", "BMW", "Dodge"};

        String [] cars2 = {"Toyota","Honda", "Tesla", "BMW", "Dodge"};

        String [] cars3 = {"toyota","honda", "tesla", "bmw", "dodge"};

        String [] cars4 = {"Toyota","Honda", "Tesla"};

        System.out.println("cars1 == cars2 > "+Arrays.equals(cars1,cars2));
        System.out.println("cars1 == cars3 > " +Arrays.equals(cars1,cars3));
        System.out.println("cars4 == cars3 > " +Arrays.equals(cars4,cars3));

        boolean bool2= Arrays.toString(cars2).equalsIgnoreCase(Arrays.toString(cars3));
        System.out.println(bool2);

        //

        String[] newCars = Arrays.copyOf(cars1, 2);
        System.out.println(Arrays.toString(newCars));





    }
}
