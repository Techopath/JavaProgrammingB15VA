package day_16_memory_string_while_loop_intro;

public class WhileLoopIntro {
    public static void main(String[] args) {
        int num =1;
       /* if (num <= 10){
            System.out.println("Hello world");
        }*/
       int count = 0;
        while (num<=10){ //infinite loop
            System.out.println("hello world");
            num++; //or num = num+1;
            count =count +1;
        }

        System.out.println(count);

        //create a variable steps and assign 1 to it.
        //write a while loop to repeat 100 times.
        //  //each time print "Taking a step 2"
        //        int steps = 1;
        //      while(steps <= 100){
        //          System.out.println("Taking a step "  + steps);
        //          steps++;
        //      }
        //        System.out.println("steps = " + steps);



    }
}
