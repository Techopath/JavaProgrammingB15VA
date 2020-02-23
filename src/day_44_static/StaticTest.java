package day_44_static;
import day_04_math_operators_scanner.MathOperations;

import java.util.*;
public class StaticTest {
    public static void main(String[] args) {
        //System.out.println(StaticVariables.name); //if static not written in public this line of code will not work.

        StaticVariables obj= new StaticVariables();
        System.out.println(obj.name); //if within StaticVariables public String name = "FannieMae";

        System.out.println(StaticVariables.userName); //if within StaticVariables public static String userName = user@gmail.com
        System.out.println(StaticVariables.age);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        Character.isDigit('8');
        System.out.println(Character.isDigit('k'));

        System.out.println(Calculator.plus(3,5)); //if static is present

        //
        Calculator calc = new Calculator();
        System.out.println(calc.plus(5,3));

       // System.out.println(Calculator.minus(2,5)); //if static not there not working

        //in order to remove the problem create an object as follows

        Calculator clc1 = new Calculator();
        System.out.println(clc1.minus(4,6));

        ////----------

        Math.round(11.49);
        System.out.println(Math.round(11.49));

        System.out.println(Math.abs(-18));

        System.out.println(Math.max(1,5));

        System.out.println(Math.cos(45));

        System.out.println(Math.round(85.50));

       // Math m = new Math(); we cannot instantiate from Math because it is private by the code writer


    }
}
