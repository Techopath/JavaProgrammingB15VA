package replitExamples;
import java.lang.reflect.Array;
import java.util.*;
public class FindNonDuplicate_119 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int [] nums = {1,2, 2, 3, 1 , 3, 5};
//            {1,2, 2, 3, 1 , 3, 5, 5}
        //TODO: write your code below
        System.out.println(Arrays.toString(nums));
        System.out.println();
        int count =0;
        for (int i = 0; i < nums.length; i++) {
                count =0;
            for (int j = 0; j < nums.length; j++) {

                if (nums[i]==nums[j]){
                    count ++;
                }

            }

            if (count ==1){
                System.out.println(nums[i]);
            }

        }
        System.out.println("count = " + count);



       /* for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    nums[i] = -1;
                    System.out.print(nums[i]);
                }

            }

        }
        System.out.println();
        System.out.println(Arrays.toString(nums));

        for (int k = 0; k < nums.length; k++) {
            if (nums[k] != -1){
                System.out.print(nums[k] +" ");
            }
        }

*/

    }
}
