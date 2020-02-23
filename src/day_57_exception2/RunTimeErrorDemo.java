package day_57_exception2;

public class RunTimeErrorDemo {

        static int num = 0;
        public static void main(String[] args){
            num ++;
            System.out.println("num = " + num);
            //call main method again
            main(null);
            /*whenever method is called in Java, a frame is placed in Stack memory for that method call;
            * if method calls itself recursively, another frame is placed in that frame. if it keeps continuing, eventually Stack memory becomes full
            *  and StackOverFlowError is thrown. */


        }


}
