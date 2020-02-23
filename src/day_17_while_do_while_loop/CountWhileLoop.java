package day_17_while_do_while_loop;

public class CountWhileLoop {
    public static void main(String[] args) throws  Exception{
        int counter = 1;
        while (counter <= 15 ){
            System.out.print(counter +" ");
            ++counter;
            Thread.sleep(200);//if we type "thread.sleep" in our code, we need to add "throws Exception" in main method
        }
        System.out.println(); // adds a new line
        // count the values in counter in reverse order: 10 9 8 7 6 5 4 3 2 1
        int counter2 = 10;
        while (counter2 >=1 ){
                System.out.print(counter2 + " ");
                counter2--;
                Thread.sleep(500);
            }

        /*if (counter <= 10){
            System.out.print(counter + " ");
            counter ++;
        }
        if (counter <= 10){
            System.out.print(counter + " ");
            counter ++;
        }
        if (counter <= 10){
            System.out.print(counter + " ");
            counter ++;
        }
        if (counter <= 10){
            System.out.print(counter + " ");
            counter ++;
        }
        if (counter <= 10){
            System.out.print(counter + " ");
            counter ++;
        }
        if (counter <= 10){
            System.out.print(counter + " ");
            counter ++;
        }
        if (counter <= 10){
            System.out.print(counter + " ");
            counter ++;
        }
        if (counter <= 10){
            System.out.print(counter + " ");
            counter ++;
        }
        if (counter <= 10){
            System.out.print(counter + " ");
            counter ++;
        }
        if (counter <= 10){
            System.out.print(counter + " ");
            counter ++;
        }
        if (counter <= 10){
            System.out.print(counter + " ");
            counter ++;
        }*/



    }
}
