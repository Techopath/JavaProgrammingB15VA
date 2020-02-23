package replitExamples;
import java.util.*;
public class ZombieAttack_1_125 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


          int[] inhabitants = new int[8];
          for(int i=0; i<inhabitants.length; i++) {
              inhabitants[i] = input.nextInt();
          }
        /*\
        if we put 8 cities with populations

        Day 0 [3, 6, 0, 4, 3, 2, 7, 1]
        Day 1 [1, 3, 0, 2, 1, 1, 3, 0]
        Day 2 [0, 1, 0, 1, 0, 0, 1, 0]
        Day 3 [0, 0, 0, 0, 0, 0, 0, 0]
            ---- EXTINCT ----


         */

        //TODO. Write you code below this line.


        //int [] inhabitants = {0,0,0,0,0,0};

        int count = 0;
        int sum =0;
        System.out.println("Day "+0+" "+Arrays.toString(inhabitants));
        for (int i = 0; i <= count; i++) {
            sum =0;
            for (int j = 0; j < inhabitants.length; j++) {
                    inhabitants[j] = inhabitants[j] / 2;
                    count ++;
                    sum = sum + inhabitants[j];
            }

            System.out.println("Day "+(i+1)+" "+Arrays.toString(inhabitants));
            if (sum ==0){
                System.out.println("---- EXTINCT ----");
                return;
            }


        }
    }
}
