package replitExamples;

import java.util.*;

public class CopyCertainValues_Array_126 {

    public static void main(String[] args) {
        System.out.println("-----EXAMPLE RUN ---------");
        String[] numbers = {"zero", "one", "two", "three", "four","men", "beautiful"};

        System.out.println(Arrays.toString(getWithE(numbers)));
    }


    public static String[] getWithE(String[] arr) {

        //TODO : YOUR CODE GOES HERE ----------------------
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("e")) {
                count++;
            }

        }

        String [] fewValues = new String [count];
        System.out.println(count);

       int idx = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].contains("e")){
                    fewValues[idx]=arr[j];
                    idx++;
                }
            }



//
//        String[] fewValues = new String[count];
//        int counter = 0;
//        for (String each : arr) {
//            if (each.contains("e")) {
//
//                fewValues[counter] = each;
//                counter++;
//            }
//        }
        //YOUR CODE ENDS HERE -----------------------
        return fewValues;
    }
}
