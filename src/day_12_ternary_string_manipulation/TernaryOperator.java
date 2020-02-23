package day_12_ternary_string_manipulation;

public class TernaryOperator {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 150;
        int max=(num1<num2) ? num1 : num2;

        System.out.println("The max number is " +max);
        boolean m = (num1<num2) ? true : false;
        System.out.println(num1 +" is " +m);

        int score =65;
        String result = (score >= 60) ? "pass" : "fail";
        System.out.println("result = " + result);
    }
}
