package day_57_exception2;

public class CheckedExceptionDemo{

    public static void main(String[] args) /*throws Exception*/{ //if we declare throws Exception we will not need to handle it using try{} catch(){}
        System.out.println("Checked Exception in next Line");
        //if we handle the following error
     // Thread.sleep(500); //

        System.out.println("Perfect stands for outstanding");
        try{
            Thread.sleep(100);
            int nums = 10/0;
            System.out.println("hey");
        }catch (Exception e){

            System.out.println("Error caught");
        }
        System.out.println("After Thread.sleep");



    }
}

