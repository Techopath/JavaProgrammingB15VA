package replitExamples;

import java.util.ArrayList;

public class RepeatAll_ArrayList {

    public static void main(String[] args) {
        ArrayList<Boolean> bl = new ArrayList<>();

        bl.add(true);
        bl.add(false);
        bl.add(false);

        System.out.println(bl.toString());
        System.out.println(bl.size());

        repeatAL(bl);

    }
    //create your method below

    public static void repeatAL(ArrayList<Boolean> bool) {

        ArrayList<Boolean> modifiedBoolean = bool;
  modifiedBoolean.addAll(bool);
//        modifiedBoolean.addAll(bool);

        //using and wasting time with for loop

//        for (int i = 0; i < bool.size() ; i++) {
//            modifiedBoolean.add(bool.get(i));
//        }
//        for (int i = 0; i < bool.size() ; i++) {
//            modifiedBoolean.add(i+3, bool.get(i));
//        }

        System.out.println(modifiedBoolean.toString());
    }

    }
