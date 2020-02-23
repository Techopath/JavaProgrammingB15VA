package day_25_arrays_day4_split;
import java.util.Scanner;
public class TimeArray {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        int [] time1 = {scan.nextInt(), scan.nextInt()};
        int [] time2 = {scan.nextInt(), scan.nextInt()};
        //declare two int arrays
//        int [] time1 = {18, 50};
//        int [] time2 = {18, 50};

        if (time1 [0]<time2[0]){
            System.out.println("Time1 is earlier "+time1[0] + ":"+time1[1]);

        }else if (time2[0]<time1[0]){
            System.out.println("Time2 is earlier "+time2[0]+":"+time2[1]);
        }else if (time1[1]<time2[1]){
            System.out.println("Time1 is earlier "+time1[0]+":"+time1[1]);
        }else if(time2[1]<time1[1]){
            System.out.println("Time2 is earlier "+time2[0]+":"+time2[1]);

        }else{
            System.out.println("time1 and time2 are equal "+time2[0]+":"+time2[1]);
        }
    }
}
