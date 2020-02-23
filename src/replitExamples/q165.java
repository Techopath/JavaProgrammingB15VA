package replitExamples;
import java.util.*;
public class q165 {
    public static void main(String[] args) {
        System.out.println(getThunderBlazz(true, false, 1, 5, 6));
    }

    public static boolean getThunderBlazz(boolean available, boolean gift, int ingredient1, int ingredient2, int ingredient3) {

//        boolean isTrue = false;
//        if (available != true) {
//            isTrue = false;
//        } else {
//            if (gift != true) {
//                isTrue = false;
//            }
//        else {
//                if ((ingredient1 != 1 && ingredient2 != 2 && ingredient3 != 3) && (ingredient1 != 3 && ingredient2 != 1 && ingredient3 != 2)) {
//                    isTrue = false;
//                } else {
//                    isTrue = true;
//                }
//
//            }
//
//        }
//        return isTrue;
//    }
        if (available==true || gift==true){
            return true;
        }else if((ingredient1==1 && ingredient2==2 && ingredient3==3) ||
                (ingredient1==3 && ingredient2==1 && ingredient3==2)) {
            return true;
        }
        return false;

    }

}
