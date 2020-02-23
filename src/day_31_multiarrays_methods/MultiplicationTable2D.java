package day_31_multiarrays_methods;

import java.util.Arrays;

public class MultiplicationTable2D {
    public static void main(String[] args) {
        int [] [] multiplicationTable = new int [10][10];
        int multiply =1;
        for (int outer = 1; outer<=10; outer++){
            for (int inner = 1; inner <=10; inner++) {

                System.out.print(outer*inner +" ");
                multiplicationTable [outer][inner] = outer*inner;
            }
            System.out.println();
        }

    }
}
