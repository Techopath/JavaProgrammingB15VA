package replitExamples;
import java.util.*;
public class q129_Arrays_match_two {

        public static void main(String[] args) {

            Scanner inp = new Scanner(System.in);
            System.out.println("Enter the size for row and column");
            int rows = inp.nextInt(), cols = inp.nextInt();
            if (rows <2 || cols < 2){
                System.out.println("Please enter correct dimensions for your array");
                return;
            }
            int[][] arr = new int[rows][cols];

            System.out.println("Enter the array numbers" );
            for(int i=0 ;i<=rows-1;i++) {
                for(int j=0 ;j<=cols-1;j++) {
                    arr[i][j]=inp.nextInt();
                }//end for cols
            }//end for rows

            //for simple arrays

//            int [] numArrays = {1,2,4,5,5,7};
//            int [] numArrays2 = {1,2,4,4,4,7};
//            //your code here
//            int counter =0;
//            for (int i = 0; i < numArrays.length-1; i++) {
//
//                    if (numArrays[i] == numArrays[i+1]){
//                        counter ++;
//
//                    }
//
//            }
//            int cnt =0;
//            for (int j = 0; j < numArrays2.length-1; j++) {
//                if(numArrays2[j] == numArrays2[j+1]){
//                    cnt ++;
//                    break;
//                }
//            }
//
//            System.out.println("found "+(counter+cnt)+" matches");
            /////////////////

            /*
            lets say we have 3 by 3 array:
            1 1 2
            3 3 1
            4 4 4

             */


            int matches =0;

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j <arr.length-1; j++) {
                    if (arr[i][j] == arr[i][j+1]){//00-01, 01-02 / 10-11, 11-12 /20-21,21-22
                       matches++;
                    }
                }
            }

           System.out.print("matches: "+matches);

        }//end main
    /*
3
3
1
1
2
3
3
1
4
4
4
     */
}
