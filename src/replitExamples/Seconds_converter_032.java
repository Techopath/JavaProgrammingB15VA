package replitExamples;
import java.util.Scanner;
public class Seconds_converter_032 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter seconds:");
        int inputSeconds = scan.nextInt();
        int hours = inputSeconds / 3600;
        int minutes = (inputSeconds - hours * 3600) / 60;
        int seconds = (inputSeconds - hours * 3600 - minutes * 60);
        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
    }

}
