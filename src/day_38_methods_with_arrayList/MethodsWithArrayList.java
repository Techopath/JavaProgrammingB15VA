package day_38_methods_with_arrayList;

import org.w3c.dom.ls.LSOutput;

import java.util.*;


public class MethodsWithArrayList {
    /*
    Method: printList
    parameters: List<Integer>
    return: void
    Print each value in same line separated by space;
    listA= {4,2,3};
    printList(listA); => print 4 2 3
     */
    /*
    method: doubleTheList
    param: list<Integer> nums
    return void
    it updates each number in nums by doubling it.
    nums -> 4,2,6
    doubleTheList -> 8,4,12

     */
    /*
    method: sumList
    param:  List<Integer> nums
    return: void

    sum the numbers in nums

     */

    public static void main (String [] args){
        int [] a = {1,5,4,7,8,9};
       // printList(a);

        List<Integer> nums = new ArrayList<>();
        nums.add(5); nums.add(10);nums.add(1);nums.add(23);nums.add(8);nums.add(6);

        prList(nums);

        List<Integer> nums2 = new ArrayList<>();
        nums2.add(1);nums2.add(2);nums2.add(6);nums2.add(0);nums2.add(20);
        System.out.println("nums2 before doubling = " + nums2);
        doubleTheList(nums2);
        System.out.println("nums2 after doubling= " + nums2.toString());
        //
        //sum List
        sumList(nums2);

        int addition=summationList(nums2);
        System.out.println("addition : "+addition);

    }
    //sumList

    public static int summationList (List<Integer> numbers){
        int summation = 0;
        for (int ieach:numbers) {
            summation += ieach;
        }
        return summation;
    }

    public static void sumList(List<Integer> nums){
        int sum =0;

        for (int each:nums) { //we can write int despite we have Integer array of numbers. because of unboxing rule.

            sum+= each;

        }
        System.out.println("sum = " + sum);
    }
    //doubleTheList
    public static void doubleTheList(List<Integer> numbers){
        System.out.println();
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i)*2);
            System.out.print(numbers.get(i)+" ");

        }
//putting an if statement to print out the numbers greater 15.
        System.out.println();
        for (int i = 0; i <numbers.size() ; i++) {
            if(numbers.get(i) >=15){
                System.out.print(numbers.get(i)+"/");
            }

        }
        System.out.println();
        System.out.println("numbers = " + numbers);
    }

    //using foe each loop

    public static void prList (List<Integer> list) {
        for (Integer each:list) {
            System.out.print(each +" ");
        }
        //System.out.println();
    }


//using for loop
//    public static void printList(int [] listA){
//        String listAwithSpace = "";
//        for (int i = 0; i < listA.length; i++) {
//           listAwithSpace = listAwithSpace + listA[i] + " ";
//        }
//        System.out.println("listAwithSpace = " + listAwithSpace);
//    }  ////



}
