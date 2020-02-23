package day_28_review;
//create a class FillArrayLoop
/*
declare int array that can hold 101 number
write a forloop 0-100
and assign values into array inside the loop

print all values in single line. Arrays.toString()
 */

import java.util.Arrays;

public class FillArrayLoop {
    public static void main(String[] args){
        //int count =0;
        int[] nums = new int [101];
        for (int i = 0; i <= 100; i++) {
//            if (i%4 ==0 && i%3==0 && i>0) { //prints out only numbers which are divisible by 4 and 3 and are greater than 0
               nums[i] = i;
//                count ++;
//            }
//            Arrays.toString(intArray);
        }


        System.out.println(Arrays.toString(nums));
        //System.out.println(count);

        //print same array in reverse order
        System.out.println("nums: "+nums.length);
        System.out.println("[");

        for (int j = nums.length-1; j >=0; j--) {
            System.out.print(nums[j]+" ");


        }
        System.out.println("]");
        //System.out.println(Arrays.toString(intArray));
    }
}
