package day_03_primitives_mathoperators;

public class UsingVariables {
    public static void main(String [] args){
        int n = 10;
        int i = n; // i is the same as n;
        System.out.println(i +" "+n);

        int num1, num2, num3;
        num1 = 100;
        num2 = num1;
        num3 = num2;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        //System.out.println(num1+num2+num3);//adds the above three numbers
        num1 =500;
        System.out.println(num1);

        // x+2y = ?
        // -x+3y = ? what is the value of x and y?
        int x = -5;
        int y = 12;
        System.out.println("x+2y = " +(x+2*y) +"\n -x+3y = " +(-x+3*y));
    }
}
