package replitExamples;
import java.util.*;

public class isPOS_Methods9_147 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size = inp.nextInt();



        //size 5.
        int[] arr = new int[size];//opens containers as the size of variable size



        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }
        //#2 Your code here
        isPos(arr);

    }

    public static void isPos(int [] num)
    {
        //#1 your code here

        for (int j = 0; j < num.length; j++) {
            if(num[j]>=0){
                System.out.println("is positive");
            }else{
                System.out.println("not positive");
            }
        }

    }

}
