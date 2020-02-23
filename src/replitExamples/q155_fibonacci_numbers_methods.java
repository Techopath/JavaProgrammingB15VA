package replitExamples;
import java.util.*;
public class q155_fibonacci_numbers_methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num){
        //WRITE YOUR CODE HERE

//        int t1=0;
//        int t2=1;
//        for (int i = 1; i <=num; i++)
//        {
//            int sum = t1 + t2;
//            t1 = t2;
//            t2 = sum;
//        }
//        System.out.println(t1);

        List<Integer> fibonacci = new ArrayList<>();

        fibonacci.add(0);
        fibonacci.add(1);

        int sum = 0;

        //              index:0 1 2 3 4 5 6 7 8 9 10
        //fibonacci numbers : 0 1 1 2 3 5 8 13 21 34

        for (int i = 0; i < fibonacci.size() ; i++) {
            sum = fibonacci.get(i) + fibonacci.get(i+1);
            fibonacci.add(sum);


        }
        System.out.println(fibonacci);



    }
}
