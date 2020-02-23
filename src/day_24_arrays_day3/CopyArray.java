package day_24_arrays_day3;

public class CopyArray {
    public static void main(String[] args) {
        int [] nums1 = {23, 43, 54, 13};
        //declare nums2 with same size as nums1
        int [] nums2 = new int [nums1.length];
        //add up nums1 and nums2

        //using for loop from nums1 and assign to nums2

        for (int i = 0; i < nums1.length; i++) {

            nums2 [i] = nums1[i];
        }
        //print values from nums1 and nums2 using for each loop
        for (int num : nums1){
            System.out.print(num + " ");
        }
        System.out.println();
        for (int num:nums2){
            System.out.print(num+" ");
        }
        System.out.println();
        int [] num3 = new int[nums1.length];

        //assign all values in doubles in nums3
        for (int j = 0; j < nums1.length; j++) {
            num3[j] = nums1[j] + nums2[j];
        }
        for (int num : num3){
            System.out.print(num +" ");
        }
    }

}
