package replitExamples;
import java.util.Scanner;
public class greaterNumber {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();

    //WRITE YOUR CODE HERE:
    if (a > b) {
        System.out.println(a +" is greater");
    }else {
        System.out.println(b +" is greater");
    }


}
}
