package day_10_switch_logical_operators;

public class LogicalOperators {
    public static void main(String[] args) {
        int apples =10;
        int orranges = 20;

        System.out.println("### Truth table for && operator ###");
        System.out.println("true && true is " +(true && true));

        if (apples == 10 && orranges == 20){
            System.out.println("Condition was true");
        }else{
            System.out.println("Condition was false");
        }
        System.out.println("false && true is " + (false && true));
        if (apples > 100 && orranges == 20){
            System.out.println("Condition was true");
        }else{
            System.out.println("Condition was false");
        }
        System.out.println("true && false is " + (true && false));
        if (apples > 1 && apples < 9){
            System.out.println("Condition was true");
        }else{
            System.out.println("Condition was false");
        }
    }
}
