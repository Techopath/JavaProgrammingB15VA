package replitExamples;
import java.util.ArrayList;
import java.util.Arrays;

public class MethodsWithArrayList_TimesTwo {
    public static void main(String[] args)
    {
ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1,2,3,4,5));
timesTwo(num);
    }
    //create your method below

    public static void timesTwo(ArrayList<Integer> nums){

        for(int i=0; i<nums.size(); i++){
            nums.set(i, nums.get(i)*2);

        }
        System.out.println(nums);

    }
}
