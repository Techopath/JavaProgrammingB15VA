package day_37_arrayList;
import java.util.*;
public class PriceList {
    public static void main(String[] args) {
        ArrayList<Double> prices = new ArrayList<>(Arrays.asList(0.88,9.9,1.2,4.5,21.0,3.2,4.2,10.0, 5.0,200.0, 25.0));

        //calculate sum of all prices
        double sum =0.0;

        for (int i = 0; i < prices.size(); i++) {
            sum = sum + prices.get(i);

        }
        System.out.println("sum = " + sum);

        double sum2 = 0.0;
        for (double each:prices) {
            sum2 += each;

        }
        System.out.println("sum2 = " + sum2);

        //declare double arraylist cheap
        //add the prices which are less than 20.0

        List<Double> cheap = new ArrayList<>();
        List<Double> expensive = new ArrayList<>();

        for (double each:prices) {
            if (each<20.0){
                cheap.add(each);
            }else{
                expensive.add(each);
            }
        }
        System.out.println("cheap = " + cheap);
        System.out.println("expensive = " + expensive);




    }
}
