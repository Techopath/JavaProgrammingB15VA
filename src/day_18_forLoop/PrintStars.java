package day_18_forLoop;
import java.util.Scanner;
public class PrintStars {
    public static void main(String[] args ){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of stars you want to print out: ");
        int n = scan.nextInt();
        for (int i = 1; i<=n; i++){
            System.out.print("*");
        }
        System.out.println();
        String myStars = "";
        int starsCount = 9;
        /*
        assign stars to myStars String variable.
        count of stars must match value of starsCount
        * */
        for (int i =1; i<= starsCount; i=i+2){
           // System.out.println("* " + myStars);
            myStars +="* ";
            System.out.println(myStars);

        }

    }
}
