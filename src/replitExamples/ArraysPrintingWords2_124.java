package replitExamples;
import java.util.*;
public class ArraysPrintingWords2_124 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();




        String [] splitted = str.split(", ");
        String exampleWord = splitted[0];
        for (int i = 0; i < splitted.length; i++) {
            if (splitted[i].length()<exampleWord.length()){
                exampleWord =splitted[i];


            }


        }
        String shorts = "";
        for (int j = 0; j < splitted.length ; j++) {
            if(splitted[j].length()==exampleWord.length() ){
                shorts= shorts+splitted[j]+" ";
            }
        }

        String [] sp = shorts.split(" ");
        Arrays.sort(sp);
      System.out.println(Arrays.toString(sp));
        //System.out.println(Arrays.toString(splitted));


        }

    }