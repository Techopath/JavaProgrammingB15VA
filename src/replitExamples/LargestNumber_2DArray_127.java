package replitExamples;
import  java.util.*;
public class LargestNumber_2DArray_127 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter rows and cols: ");
        int rows = inp.nextInt(), cols = inp.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("now Enter the numbers: ");
        for(int i=0 ;i<=rows-1;i++)
        {
            for(int j=0 ;j<=cols-1;j++)
            {
                arr[i][j]=inp.nextInt();
            }//end for cols
        }//end for rows


        //TODO write your code below

        int example = arr [0][0];
        for (int i = 0; i<arr.length; i++){
            for (int j=0;j<arr[i].length; j++){
                if(arr[i][j]>example){
                    example = arr[i][j];
                }
            }
        }
        System.out.println(example);



    }//end main
}
