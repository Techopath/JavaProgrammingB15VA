package replitExamples;

import java.util.Arrays;
import java.util.Scanner;

public class q130_arrays_innerAndOuter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inner size: ");
        int sizeInner = scan.nextInt();
        System.out.println("outer size: ");
        int sizeOuter = scan.nextInt();

        int[] inner = new int[sizeInner];
        int[] outer = new int[sizeOuter];
        System.out.println("enter numbers for Inner: ");
        for (int i = 0; i < sizeInner; i++) {
            inner[i] = scan.nextInt();
        }
        System.out.println("Enter numbers for Outer: ");
        for (int j = 0; j < sizeOuter; j++) {
            outer[j] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);
        //WRITE YOUR CODE HERE
        //12345
        //23
        boolean isTrue = false;
        int idx =0;
        for (int i = 0; i < inner.length ; i++) {
            for (int j = 0; j < outer.length; j++) {
                if (inner[i] ==outer[j]){

                    idx ++;
                    break;
                }

            }

        }
        if (idx == inner.length){
            isTrue = true;
        }
        else{
            isTrue =false;
        }
        System.out.println(isTrue);

        System.out.println("idx"+idx);
        System.out.println("inner length: "+inner.length);

        //on 2019. not finished!!!! ----01/05/2020 now finished! -_- after a year

    }
}
