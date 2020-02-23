package day_22_String_manipulation_arrays;

public class ForEach {
    public static void main(String[] args) {
        int[] nums = {5, 6 , 11, 725, 90};
        double[] prices = {19.99, 23.5, 9.99, 5.99, 102.5};
        System.out.println("Elements: ");
        for(int temporrayVariable :nums ){
            System.out.print(temporrayVariable+", ");
        }
        System.out.println("\nprices: ");
        for (double price:prices){
            System.out.print(price+ ", ");
        }
        //we can use the following for loop method to find
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");

        }

    }

}
