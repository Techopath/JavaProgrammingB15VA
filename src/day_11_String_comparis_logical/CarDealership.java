package day_11_String_comparis_logical;
import java.util.Scanner;
public class CarDealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the model you want. toyota, audi, bmw or tesla you want?");
        String carModel1 = scan.next() ;

        System.out.println("Enter your affordable budget");
        double affordableAmount = scan.nextDouble();
        double carPriceToyota = 35000;
        double carPriceTesla = 42000;
        String carModel = "";
        if (carModel1.equalsIgnoreCase("Toyota") || carModel1.equalsIgnoreCase("tesla") ){
            if (affordableAmount == carPriceToyota || affordableAmount == carPriceTesla) {
                System.out.println("You can buy " + carModel1);
            }else {
                System.out.println("You cannot buy " + carModel1 + " with your affordable" + affordableAmount +" amount" );
            }
        }else {
            System.out.println("With this budget we have other car models but not " +carModel1 );
        }



    }
}
