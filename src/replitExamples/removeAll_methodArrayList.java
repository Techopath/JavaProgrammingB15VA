package replitExamples;
import java.lang.reflect.Array;
import java.util.*;
public class removeAll_methodArrayList {


    public static void main(String[] args) {
        //create your method below

        ArrayList<String> strArray = new ArrayList<>();
        strArray.add("man");
        strArray.add("hi");
        strArray.add("yo");
        strArray.add("hi");
        String strToBeRemoved ="hi";

        removeAll(strArray, strToBeRemoved);


    }
    public static void removeAll(ArrayList<String> wordList, String targetWord){

        for (int i = 0; i < wordList.size(); i++) {

            if(wordList.get(i).equals(targetWord)){
                wordList.remove(i); i--;
            }


        }

        System.out.println(wordList);




    }
}
