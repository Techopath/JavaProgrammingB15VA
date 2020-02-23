package day_24_arrays_day3;
//Arrays.sort() METHOD
import java.util.Arrays;
public class Arrayssort {
    public static void main(String[] args) {
        int[] nums = {44, 12, 5 ,6, 70, -5};
        System.out.println("before sorting");
        System.out.println(Arrays.toString(nums));
        //
        Arrays.sort(nums);//sorting nums array values
        //
        System.out.println("after sorting");
        System.out.println(Arrays.toString(nums));

        //read the largest number from array nums

        //we sort it first and then read the last index

        System.out.println("greatest number : "+nums[nums.length-1]);
        //smallest number
        System.out.println("smallest number is "+nums[0]);
         //
        //declare companies array and assign 4 companies
        String [] companies = {"Cybertek", "CapitalOne","1CapitalOne", "Apple", "apple", "1", "Google", "Verizon"};//checks aasci codes and prints out accordingly
        //because of this reason apple with lowercase letters is printed out at the end.
        //sort
        Arrays.sort(companies);
        System.out.println(Arrays.toString(companies));

       //

        String [] words = {"apples", "cherries", "bananas"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

    }
}
