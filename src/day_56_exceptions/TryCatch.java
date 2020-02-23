package day_56_exceptions;

public class TryCatch {

    public static void main(String[] args) {
        System.out.println("Before Try Catch: ");
        //lets handle the following ArithmeticException

        try{
            System.out.println("In try block");
            int result = 10/0; //if 10/2 then it doesnt find any issue so jumps catch without printing it.
            System.out.println("After 10/0 line"); //if exception occurs then it directly jumps to catch.
        } catch (ArithmeticException e){
            System.out.println("Exception happened, and was handled!");
        }

        System.out.println("After Try Catch: ");
        System.out.println("-----------------2.nd example-----------------------");
        try{
            System.out.println("In second try block");
            String str = "java is fun!";
            System.out.println(str.charAt(0));
            System.out.println(str.charAt(1));
            System.out.println(str.charAt(20));//found exception StringOutOfBoundException occurred
            System.out.println(str.charAt(1)); //this line will not be run


        }catch (Exception e){
            System.out.println("Exception happened in try block and caught");
            System.out.println("Continue to compile");
        }
        System.out.println("After second try catch ");
    }

}
