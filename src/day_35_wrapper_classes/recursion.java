package day_35_wrapper_classes;

public class recursion {
    public static void main(String[] args) {
        //printNum(5);

        printNumGood(6);
    }
    /*
    recursive method without terminate condition.
     */
//    public static void printNum(int num){
//        System.out.println(num);
//        printNum(num);
//    }
    public static void printNumGood(int num){
        if (num > 0) { //end condition

            System.out.println(num);
            printNumGood(num - 1);
        }
        else{
            return;
        }

    }

}
