package day_35_wrapper_classes;

import java.util.Arrays;

public class MethodsWithArrays {

    /*
    Method: printArray
    arg/param: int [] nums
    return: void
    print each item in the array in separate line

     */

    public static void main(String[] args) {
        int [] myNums = {3,1,2,3,5,7,8};
        printArray(myNums);

        //method name: has10
        int [] as10 = {1,10,20,1,4,3};
        has10(as10);
        System.out.println(has10(as10));

        //------------------------------------method name: longerThan3--------------------------
        double[] n = {1.2, 2.3, 5.2, 3.2};
        System.out.println("The array "+ Arrays.toString(n)+" is longer than 3: "+longerThan3(n));

    }
    // method name: printArray
    public static void printArray(int [] nums){
        for (int eachNum:nums) {
            System.out.println(eachNum);
          //  System.out.println(nums.length);//gives the array length
        }
    }
    /*
    method name: has10
    arg/params: int [] nums
    return: boolean
    returns true if there is 10 in the array, returns false if 10 does not exist
     */

    public static boolean has10 (int[] nums){

//        boolean found = false;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] ==10){
//                found = true;
//                break;
//            }
//
//        }
//        return found;

        for (int item: nums) {
            if (item == 10){
                return true;
            }
        }
        return false;

    }
    /*
    method name: longerThanThree
    input/ parameters: double [] nums
    return: boolean

    returns true if length is more than three, returns false otherwise
     */

    public static boolean longerThan3(double [] nums) {

       return nums.length>3; //shorter way

       /* if (nums.length > 3) { //longer way
            return true;
        }
        return false;
        */

    }

}
