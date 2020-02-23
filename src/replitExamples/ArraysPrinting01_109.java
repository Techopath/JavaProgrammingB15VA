package replitExamples;
import java.util.Scanner;
public class ArraysPrinting01_109 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextLine();
        }
        //leave above alone!  write your code below


        for (int j = 0; j < arr.length; j++) {
        if (arr[j].length() <3){
          return;
        }else {
        System.out.println(arr[j].substring(0, 3));
                }
        }


    }
}