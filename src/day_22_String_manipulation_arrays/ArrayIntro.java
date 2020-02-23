package day_22_String_manipulation_arrays;



public class ArrayIntro {
    public static void main(String[] args) {
        //declare array with size 4
        int[] nums = new int [4]; //you can add [] after nums variable
        //assign values to each index.
        nums [0]=100;
        nums [1] =200;
        nums [2]=700;
        nums [3] = -5;

        //print out first number in the array
        System.out.println("index at 0 "+nums[0]);
        System.out.println("index at 1 "+nums[1]);
        System.out.println("index at 2 "+nums[2]);
        int third = nums[3];
        System.out.println("index at 3 " + third);
        //System.out.println("index at 3 "+nums[4]); //Arrayindexoutofboundexception

        int i=0;
        System.out.println("index at i "+nums[i]);
        i++;
        System.out.println(nums[i]);
        //print out number of elements/values
        System.out.println("number of elements "+nums.length);
        int len = nums.length;
        System.out.println("len = " + len);

        //modify index 0 to 222;
        nums[0]=222;
        System.out.println(nums[0]);

        nums[3]=1;
        System.out.println("nums = " + nums[3]);

        nums[2]=nums[1];
        System.out.println("nums = " + nums[2]);
        
        boolean a [] =new boolean[2];
        a[0]=true;
        a[1]=false;
        System.out.println("a[0] = " + a[0]);

        String str[] = new String[4];
        str[0] = "abc";



    }
}
