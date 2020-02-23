package replitExamples;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;

public class removeEveryOther {


    public static void main(String[] args) {
ArrayList<String> str = new ArrayList<>(Arrays.asList("hi", "yo","sup","yolo", "boop"));

removeEveryOther(str);
    }

    public static void removeEveryOther(ArrayList<String> words){



        for(int i=0; i<words.size(); i++){
           if(i !=1 || i != 3){
               words.remove(i);
           }
        }

        System.out.println(words);
    }

}
