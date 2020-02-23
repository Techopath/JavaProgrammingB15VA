package replitExamples;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class TwoTimes_ArrayList {

    public static void main(String[] args)
    {
ArrayList<Integer> nums = new ArrayList<>();
nums.add(1);
nums.add(5);
nums.add(3);
nums.add(7);
twoTimes(nums);

        System.out.println(twoTimes(nums).toString());

    }
    //create your method below

    public static ArrayList<Integer> twoTimes(ArrayList<Integer> ints){ //{1, 5, 3 , 7} +> should give = {1,1,5,5,3,3,7,7}

        ArrayList<Integer> modifiedTwoTimes = new ArrayList<>();

        for (int i = 0; i < ints.size(); i++) {
            modifiedTwoTimes.add(ints.get(i));
          modifiedTwoTimes.add(ints.get(i));


        }

        return modifiedTwoTimes;


    }

}
