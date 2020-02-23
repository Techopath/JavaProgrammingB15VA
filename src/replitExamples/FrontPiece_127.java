package replitExamples;
import java.lang.reflect.Array;
import java.util.*;

public class FrontPiece_127 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
        int [] front = new int [2];



            if (num.length <2){
                front [0] = num[0];

                System.out.println("["+front[0]+"]");



            }else if (num.length>2){

                front[0] = num[0];
                front[1] = num[1];

                 System.out.println(Arrays.toString(front));


            }

    }
}
