package replitExamples;

import java.util.*;

public class arrays_has_55_113 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO Type your code below:
boolean isContain=false;
        for (int i = 0; i < nums.length - 1; i++) {
            //System.out.println(nums[i]);
            if (nums[i] == 5 && nums[i + 1] == 5) {
                isContain = true;
            }
//             else  if (nums[i] != 5 && nums[i + 1] != 5){
//               isContain = false;
//            }
        }
        System.out.println(isContain);


//the following also correct;
//        boolean result = false;
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (nums[i] == 5 && nums[i + 1] == 5) {
//                result = true;
//            }
//        }
//        System.out.println(result);


    }
}