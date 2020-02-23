package replitExamples;
import java.util.*;
public class q138_zombie_attack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int [] inhabitants = new int [8];
//        for (int i = 0; i < inhabitants.length; i++) {
//            inhabitants[i] = scan.nextInt();
//
//        }
        int [] inhabitants = {1,0,5,0,40,1,8,0};
        System.out.println(Arrays.toString(inhabitants));
        //write your code here
        //if an element is zero then the adjacent populations will lose half of its population.
        int count =0;
       int sum =0;

    for (int i = 0; i <=count; i++) {
        sum = 0;

        for (int j = 0; j < inhabitants.length; j++) {

            if (inhabitants[0] == 0) {
                inhabitants[1] = inhabitants[1] / 2;
            }
            if (inhabitants[7] == 0 && inhabitants[5] !=0) {
                inhabitants[6] = inhabitants[6] / 2;
            }


            if (inhabitants[1] == 0) {
                inhabitants[2] = inhabitants[2] / 2;
                inhabitants[0] = inhabitants[0] / 2;

            }
            if (inhabitants[2] == 0 && inhabitants[0] != 0) {

                inhabitants[1] = inhabitants[1] / 2;


            }
            if (inhabitants[2] == 0) {
                inhabitants[3] = inhabitants[3] / 2;
            }
            if (inhabitants[3] == 0 && inhabitants[1] != 0) {
                inhabitants[2] = inhabitants[2] / 2;
                inhabitants[4] = inhabitants[4] / 2;
            }
            if (inhabitants[3] == 0) {
                inhabitants[4] = inhabitants[4] / 2;
            }

            if (inhabitants[4] == 0 && inhabitants[2] != 0) {
                inhabitants[3] = inhabitants[3] / 2;
            }
            if (inhabitants[4] == 0) {
                inhabitants[5] = inhabitants[5] / 2;
            }
            if (inhabitants[5] == 0 && inhabitants[3] != 0) {
                inhabitants[4] = inhabitants[4] / 2;


            }
            if (inhabitants[5] == 0) {
                inhabitants[6] = inhabitants[6] / 2;
            }
            if (inhabitants[6] == 0 && inhabitants[4] != 0) {
                inhabitants[5] = inhabitants[5] / 2;

            }
            if (inhabitants[6] == 0 && inhabitants[4] != 0) {
                inhabitants[5] = inhabitants[5] / 2;

            }
            if (inhabitants[6] == 0) {
                inhabitants[7] = inhabitants[7] / 2;
            }

            sum += inhabitants[j];
            System.out.println(Arrays.toString(inhabitants));

        }

    }
        //System.out.println("count = " + count);

//        if (sum == 0) {
//            System.out.println("---- EXTINCT ----");
//            return;
//        }




    }

}
