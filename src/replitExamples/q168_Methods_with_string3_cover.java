package replitExamples;

import java.util.Arrays;

public class q168_Methods_with_string3_cover {
    public static void main(String[] args) {
        System.out.println(coverString("hello hello", "ello")); //java [me]thods
    }

    public static String coverString(String main, String coverME) {
        String coverString = "";
        if(main.contains(coverME)){
            coverString = main.replace(coverME, "[" + coverME + "]");
        }else{
            coverString = main;
        }

        return coverString;
    }

//    String newCoveredStr = "";
//    String[] splitbyCoverMe = main.split(coverME);
//    // System.out.println(Arrays.toString(splitbyCoverMe));
//
//    String[] splitBySpace = main.split(" ");
//        if (!main.contains(coverME)) {
//        System.out.println(main);
//
//    } else {
//        for (int i = 0; i < splitbyCoverMe.length; i++) {
//
//
//            newCoveredStr = newCoveredStr + splitbyCoverMe[i] + "[" + coverME + "]";
//
//        }
//    }
//    //newCoveredStr = newCoveredStr.substring(0, newCoveredStr.length()-coverME.length()-2);
//
//
//
//        return newCoveredStr;
//}



}