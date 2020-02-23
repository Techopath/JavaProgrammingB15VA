package day_21_For_loop_4_arrayintro;
import java.util.*;
public class PrintStarsColumnAndRows {
    public static void main(String[] args) {
        Random random = new Random();

        int rows = random.nextInt(2)+1;
        int columns = random.nextInt(2)+1;


            for (int j = 1; j <=rows ; j++) {
                for (int i = 1; i <=columns ; i++) {
                    System.out.print("*");
                }
                System.out.println();

            }

    }
}
