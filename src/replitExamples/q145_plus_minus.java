package replitExamples;
import java.util.*;
public class q145_plus_minus {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        plus_minus(arr);
    }//end main

    //WRITE YOUR METHOD HERE
    public static void plus_minus(int [] array){
        int countMinus=0;
        int countPlus=0;
        int countZero =0;
        for (int i = 0; i < array.length; i++) {


            if (array[i]<0){
                countMinus ++;
            }else if (array[i]>0){
                countPlus++;
            }else if(array[i]==0){
                countZero ++;
            }
        }
        System.out.println("positives: "+countPlus+", negatives: "+countMinus+", zeros: "+countZero);
    }

}
