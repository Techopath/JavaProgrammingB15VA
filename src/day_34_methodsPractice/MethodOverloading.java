package day_34_methodsPractice;

public class MethodOverloading {
    public static void main(String[] args) {
sum(3,5);
sum(1,1.2);
sum("hello","my","bro");
sum(1,2);
    }
//method name: sum
    public static void sum (int num1, int num2){
        System.out.println("sum (int num1, int num2): "+(num1+num2));

    }
    //method name: sum
    public static void sum (int num1, int num2, int num3){
        System.out.println("sum (int num1, int num2, int num3): "+(num1+num2+num3));

    }
    //method name: sum
    public static void sum (int n1, double n2){
        System.out.println("sum (int num1, double num2): "+(n1+n2));

    }
    //method name: sum
    public static void sum(String str1, String str2, String str3){
        System.out.println("sum(String str1, String str2, String str3): "+(str1+str2+str3));
    }
    //method name: sum
    public static void sum(double n1, double n2){
        System.out.println("sum(double n1, double n2): "+(n1+n2));
    }

}
