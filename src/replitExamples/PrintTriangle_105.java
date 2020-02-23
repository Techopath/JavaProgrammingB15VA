package replitExamples;
import java.util.Scanner;
public class PrintTriangle_105 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int k=i; k<=n; k++){
            for(int m =j; m<=n; m++){
                System.out.println("*");

            }

        }

    }
}
