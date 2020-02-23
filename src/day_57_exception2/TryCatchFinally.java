package day_57_exception2;
import java.lang.reflect.Array;
import java.util.*;
public class TryCatchFinally {
    public static void main(String[] args) {
        System.out.println("Before try catch");
        try{
            System.out.println("Hello from Try Block");
            String str = null; //null means not pointing to any object in the memory
            System.out.println(str.length());
        }catch (Exception e){
            System.out.println("Exception happened and caught");
        }
        System.out.println("After try Catch");



        try{
            System.out.println("Hello from Try Block");
            String str = null; //null means not pointing to any object in the memory
            System.out.println(str.length());
        }catch (Exception e){
            System.out.println("Exception happened and caught");
        }finally {
            System.out.println("finally block runs if there is an exception or not. ");
        }
    }
}
