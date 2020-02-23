package day_11_String_comparis_logical;
import java.util.Scanner;
public class usstaes_with_scanner {
    public static void main(String[] args) {
        while (true) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the name of state to see the first two letter");
        String state = scan.next();
        String state1 = "Virginia";
        String state2 = "CAlifornia";
        if (state.equals(state1)){
            System.out.println("VA");

        } else {
            System.out.println("the letters does not match");

        }
        System.out.println("Type the name of state");
        if (state.equalsIgnoreCase(state2)){
            System.out.println("Ca");
        }
    }
    }
}
