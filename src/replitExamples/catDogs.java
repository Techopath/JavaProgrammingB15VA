package replitExamples;
import java.util.*;
public class catDogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.nextLine();

        for (int i = 0; i <word.length()-2 ; i++) {
            if (word.substring(i,i+3).contains("cat")){
                countOfCats ++;

            }else if (word.substring(i,i+3).contains("dog")){
                countOfDogs++;
            }


        }

        if (countOfCats == countOfDogs){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        System.out.println("number of cats "+countOfCats);
        System.out.println("number of dogs "+countOfDogs);
    }



}
