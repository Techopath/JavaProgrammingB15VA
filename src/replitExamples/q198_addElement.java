package replitExamples;

import java.lang.reflect.Array;
import java.util.Arrays;

public class q198_addElement {
    public static void main(String[] args) {
        int[] even = { 2, 4, 6 };
        int[] odd = { 1, 3, 5 };

        int[] result = addElements(even, odd);

        System.out.println(Arrays.toString(result));

    }
    public static int[] addElements(int[] ints1, int[] ints2) {

        int [] addition = new int [ints1.length];
        for (int i = 0; i < ints1.length ; i++) {
            for (int j = 0; j < ints2.length; j++) {
                if (i ==j) {
                    addition[i] = ints1[i] + ints2[j];
                }
            }
        }

return addition;

    }
}
