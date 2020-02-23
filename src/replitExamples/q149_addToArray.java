package replitExamples;
import java.util.*;
public class q149_addToArray {


    public static void main(String[] args) {



        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(), n = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        int [] newArr = new int[size+1];

        System.out.println(newArr.length);

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
            System.out.println(newArr[0]);
            newArr[newArr.length-1] = n;
        }

        System.out.println(Arrays.toString(newArr));








    }
    public static void addToArr(int[] arr, int n){
        //create new array with one more position.
        int[] newArr;
    }

}
