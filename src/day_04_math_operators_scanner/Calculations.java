package day_04_math_operators_scanner;

public class Calculations {
    public static void main(String [] args){
        double x = 0.2, y = 1.2; //Use double to get a decimal answer. int gives only the whole number.
        double z = x/y;
        System.out.println(z);
        double price1 = 15.5;
        double price2 = 55.1;
        double price3 = 10.0;
        double totalPrice = price1+price2+price3;
        System.out.println("Total price: " + totalPrice);

        double balance = 1200;
        double remainingBalance = balance-totalPrice;
        System.out.println("The remaining balance in your account is $" + remainingBalance);
    }
}
