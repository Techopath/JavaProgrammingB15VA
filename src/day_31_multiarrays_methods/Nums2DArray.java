package day_31_multiarrays_methods;

import java.util.Arrays;

public class Nums2DArray {
    public static void main(String[] args) {
        int [][] nums2D = {
                {12, 55, 4 , 7},
                {123, 555, 9},
                {56,87,455,34},
                {234, 12, 54, 23, 23}
        };
        System.out.println("Number of rows: "+nums2D.length);
        System.out.println("number of columns: "+nums2D[1].length);

        //Task1. print length of each array using a loop
        for (int i = 0; i < nums2D.length; i++) {
            System.out.println(nums2D[i].length);
            System.out.println(Arrays.toString(nums2D[i]));


        }
        for (int each =0; each < nums2D.length; each++)
            Arrays.sort(nums2D[each]);
        System.out.println(Arrays.deepToString(nums2D));

        //print all numbers separated by space in new line for
        System.out.println("for loop");
        for (int row = 0; row < nums2D.length; row++) {

            for (int col = 0; col < nums2D[row].length; col++) {
                System.out.print(nums2D[row][col]+" ");
            }
            System.out.println();

        }
        System.out.println("###### FOR EACH LOOP ######");
        for (int[] nums1D : nums2D){
            for(int num : nums1D){
                System.out.print(num +" ");
            }
            System.out.println();
        }
        //Count sum of all numbers and print out
        System.out.println("#### CALCULATING SUM OF ALL NUMBERS IN 2D ARRAY###");
        int sum = 0;
        for(int[] nums1D : nums2D){
            for(int num : nums1D){
                sum += num; // sum += nums2D[i][j]
            }
        }
        System.out.println("sum = " + sum);

        }
    }

