package day_12_ternary_string_manipulation;

public class ThreeNums {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        int num3 = 10;
        System.out.println("this program prints out the biggest of three numbers");
        if (num1>=num2 && num1>=num3 ) {
            System.out.println(num1 + " is largest number");


        }else if (num2>=num1 && num2>=num3) {
            System.out.println(num2 + " is largest");
        }else {
            System.out.println(num3 +" is largest");
        }
    }
}