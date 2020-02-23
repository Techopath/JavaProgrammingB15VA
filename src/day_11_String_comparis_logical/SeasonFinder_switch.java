package day_11_String_comparis_logical;
import java.util.Scanner;
public class SeasonFinder_switch {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the month in digits");
        int month = scan.nextInt();
        String winter = "winter";
        String spring = "spring";
        String summer ="summer";
        String fall ="fall";
        switch (month) {
            case 1: case 2: case 12:
                System.out.println(winter);
                break;
            case 3: case 4: case 5:
                System.out.println(spring);
                break;
            case 6: case 7: case 8:
                System.out.println(summer);
                break;
            case 9: case 10: case 11:
                System.out.println(fall);


        }
    }
}
