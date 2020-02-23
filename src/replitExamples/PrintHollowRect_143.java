package replitExamples;
import java.util.*;
public class PrintHollowRect_143 {
    public static void main(String[] args) throws Exception {


        printHollowRect();
    }
public static void printHollowRect () throws InterruptedException {
int n=5;
    for (int i = 0; i <= n; i++) {

        for (int j = 0; j <= n; j++) {
           if (i == 0 || j ==0 || i ==n || j ==n){
               System.out.print("* ");
               Thread.sleep(500);
           }else{
               System.out.print("  ");
               Thread.sleep(200);
           }
        }
        System.out.println();

    }

}

}
