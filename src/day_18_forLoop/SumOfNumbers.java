package day_18_forLoop;

public class SumOfNumbers {
    public static void main(String[] args) {
        int num = 10;
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
            System.out.print(sum + " ");
            System.out.println();
            if (sum % 2 == 0) {
                System.out.print("even numbers " + sum +" ");
                if (sum >= 10) {
                    break;
                }


            }


        }

    }}
