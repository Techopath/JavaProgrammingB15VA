package day_18_forLoop;

public class forLoopCount {
    public static void main (String [] args) throws Exception{
        for (int n =1; n<=5; n++){
            System.out.print(n +" ");
           Thread.sleep(500);

        }

        //infinite loop.
        /*for (;;){
            System.out.println("java is fun!");
         //break; does not let the loop to iterate more than one time.
        }*/
        System.out.println();
        for (int i=1; i<=3;i++){
            System.out.println("Hello friends!");
        }

    }
}
