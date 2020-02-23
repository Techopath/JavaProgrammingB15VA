package replitExamples;
import java.util.*;
public class q192 {




    public static void main(String[] args) {

        ArrayList<Integer> nms = new ArrayList<>();
        nms.add(1);
        nms.add(2);
        nms.add(3);
        timesTwo(nms);
    }
    //create your method below

        public static void timesTwo (ArrayList <Integer> numbs) {

            for (int i = 0; i < numbs.size(); i++) {

                int t =2;
                numbs.set(i, numbs.get(i)*t);

            }
            System.out.println(numbs.toString());
        }


}