package day_11_String_comparis_logical;
import java.util.Scanner;
public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to our Car Dealership!");
        System.out.println("Enter model:");
        String carModel = scan.next();
        System.out.println("Enter price");
        double carPrice = scan.nextDouble();
        double budget = 35000.0;
        if ( (carModel.equals("toyota") || carModel.equals("tesla")) && carPrice <= budget ){
            System.out.println("I am interested in purchasing this car!");
        }else{
            System.out.println("I am not interested in purchasing this car");
        }
    }
}


