package day_21_For_loop_4_arrayintro;
import  java.util.*;
public class Triangle {
    public static void main(String[] args) {
        int range = 5;
        for (int outer = 0; outer <=range ; outer++) {
            for (int inner = 0; inner <=outer; inner++) {
                System.out.print("* ");

            }
            System.out.println();


        }
        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int m=i; m<=n; m++){
            for(int p =0; p<=m; p++){
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
