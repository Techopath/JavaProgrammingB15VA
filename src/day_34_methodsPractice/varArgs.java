package day_34_methodsPractice;

import java.util.Arrays;

public class varArgs {


    private static int sum;

    public static void main(String[] args) {
        sum(20);
        sum(1,2);
        sum(100,23,4,5,56,6,7,8,8);
    }

    public static void sum(int ... numbers){
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("sum is "+sum);
        System.out.println(Arrays.toString(numbers));
        System.out.println("index 0: "+numbers[0]);
    }
}
