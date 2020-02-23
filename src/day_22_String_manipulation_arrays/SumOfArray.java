package day_22_String_manipulation_arrays;

public class SumOfArray {
    public static void main(String[] args) {
        double [] prices = {19.99, 23.5, 9.99, 5.99, 102.5};
        double sum = 0;
        for (double k:prices ) {

            System.out.print(k +" ");
            sum = sum +k;
            //System.out.println("the sum is: "+sum);

        }
        System.out.println();
        System.out.println("the sum is: "+sum);

        for (double j:prices){
            if (j>50){
                System.out.println("price is "+j+"./ this item is too expensive, you don't need that");
                break;
            }
        }

    }
}
