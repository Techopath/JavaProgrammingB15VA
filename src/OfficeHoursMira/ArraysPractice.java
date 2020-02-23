package OfficeHoursMira;

import java.util.*;
public class ArraysPractice {
    public static void main(String[] args) {
        /*
            given an int array
            1. find average between all numbers
                - add all numbers in array
                    -loop through array and find the sum
                - divide the sum by the array length
            2. count how many elements in array
                is above or equal to average
                - create int count = 0
                - loop through array and check each element
                    if element >= average count++
            3. create new array with all elements
                   that are above or equal to average
                - create empty array with size of count
                - loop through array and check each element
                    if element >= average we will add it to
                    new array
         */
        int [] arr = {20, 0, -5, 20, 1, 12, 30, 8, 9};
        int sum = 0;
        for(int num : arr){
            sum += num; // sum = sum + num;  sum = 95
        }
        int average = sum/arr.length; //average = 10
        int count = 0;
        for (int i = 0; i<arr.length; i++){
            if(arr[i]>= average){
                count++; //count = count + 1; 1111 count = 4
            }
        }
        int [] nums  = new int[count]; //will create an array with the size of count
        //[ 0, 0, 0, 0]  =>  expecting [20, 20, 12, 30]
        int indx = 0;
        for (int i =0; i< arr.length; i++){
            if(arr[i]>= average){
                nums[indx] = arr[i]; //i=0; [20, 0, 0, 0]; i =1; i=2; i =3;
                // nums[3] = arr[3] => [20,0,0,20]
                indx++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("average: " + average);
        System.out.println(Arrays.toString(nums));

        //arays methods
        String [] words = {"apples","grapes","bananas"};
        String words_str = "apples,grapes,bananas";
        System.out.println(Arrays.toString(words));
        //create String array out of words_str and compare it with words
        //use split method

        String [] words2 = words_str.split(",");
        System.out.println(Arrays.toString(words2));
        boolean result = Arrays.equals(words2, words);
        System.out.println(result);

    }
}
