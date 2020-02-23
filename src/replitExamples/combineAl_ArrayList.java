package replitExamples;

import java.util.ArrayList;
import java.util.List;

public class combineAl_ArrayList {

    public static void main(String[] args) {
        ArrayList<String> strArr1 = new ArrayList<>();
        strArr1.add("fa");
        strArr1.add("hgh");
        ArrayList<String> strArr2 = new ArrayList<>();
strArr2.add("ter");
strArr2.add("lkwl");

        System.out.println(combineAl(strArr1,strArr2));

    }
    public static ArrayList<String> combineAl (ArrayList<String> wordList1, ArrayList<String> wordList2){


        ArrayList<String> strArr = new ArrayList<>();
        strArr.addAll(wordList1);
        strArr.addAll(wordList2);


        return  strArr;

    }
}
