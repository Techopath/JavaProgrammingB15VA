package replitExamples;
import java.util.*;
public class Arrays_shiftLeft_131 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       // int[] nums = {1, 2, 3, 4, 7, 8, 9};
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE

        if (nums.length ==1){
            System.out.println(Arrays.toString(nums));
            return;
        }

        int [] newNums = new int[nums.length];
       // System.out.println(Arrays.toString(newNums));


        //System.out.println(Arrays.toString(newNums));


        for (int i = 0; i < nums.length-1; i++) {

                int elementAt_zero = nums[0];
                newNums[i] = nums[i + 1];
                newNums[nums.length-1] = elementAt_zero;

        }

        System.out.println(Arrays.toString(newNums));

    }
}
