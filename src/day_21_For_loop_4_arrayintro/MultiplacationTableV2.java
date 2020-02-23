package day_21_For_loop_4_arrayintro;

public class MultiplacationTableV2 {
    public static void main(String[] args) {
        System.out.println("Table for #");
        for (int number = 1; number<=10;number++){
            System.out.println("Multiplication for #"+number);
            System.out.println("-------");

        for (int n = 1; n <=10; n++) {
            int result = number*n;
            System.out.print(n + "*" + number + "=" + result);

        }
            System.out.println();


        }
        for(int i = 0; i <= 10; i++){
            System.out.println("");
            if (i ==1 || i==2){
                continue;//skips iteration for 1 and 2
            }
            for(int inner = 1; inner <= 10; inner++){
                int result = inner * i;
                System.out.print(inner + " x " + i + " = " + result+"   ");
            }
        }
    }
}
