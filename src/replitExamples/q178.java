package replitExamples;

import java.util.Arrays;

public class q178 {
    public static void main(String[] args) {
       int[] ar1 = {1,2};
       int[] ar2 = {3,4};

       mergR(ar1,ar2);

        System.out.println(Arrays.toString(mergR(ar1,ar2)));
    }

    public static int[] mergR(int[] a,int[] b) {

        int lengthA = a.length;
        System.out.println("lengthA = " + lengthA);
        int lengthB = b.length;
        System.out.println("lengthB = " + lengthB);
        int len = lengthA+lengthB;
        System.out.println("len = " + len);

        int[] merge = new int[len];

        System.out.println("merge = " + merge.length);


        for(int i=0; i<lengthA; i++){

            merge[i] = a[i];
        }

        for(int z=0;z<lengthB; z++){

            merge[lengthA+z] = b[z];

        }

        return merge;

    }//end mergR
}
