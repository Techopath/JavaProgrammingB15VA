package day_28_review;
/*
declare array that can hold 10 units
write a loop that repeats 10 times
generate a random number 0-100;

 */
import java.util.*;

public class ArrayRandomNumbers {
    public static void main (String[] args){
        //create a random object
        Random rd = new Random();
        //how to generate 0-100 number using Random
       // System.out.println(rd.nextInt(101));//it generate between 0 and 100. 101 not included.
        int [] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i]= rd.nextInt(101);



        }

        System.out.println(Arrays.toString(nums));
        //sort it
        Arrays.sort(nums);
        //print again
        System.out.println(Arrays.toString(nums));


        //without loop

        int [] nums2 = {rd.nextInt(101), rd.nextInt(101),rd.nextInt(10)};
        System.out.println(Arrays.toString(nums2));


        //for infinite loop
        int count =0;
        while (true){
            int [] nums3 = {rd.nextInt(2), rd.nextInt(2),rd.nextInt(2)};
            System.out.println(Arrays.toString(nums3));


        }








    }
}
