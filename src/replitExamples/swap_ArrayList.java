package replitExamples;
import java.util.*;
public class swap_ArrayList {
    public static ArrayList<String> swap(ArrayList<String> list,int pos1,int pos2)
    {

        //swap(["one","two","three"],0,2)
        //returns:["three","two","one"]



        for (int i = 0; i <list.size(); i++) {

            if(pos1 >list.size() || pos2 >list.size()){
                System.out.println("Index should be within arrayList length. ");
                break;
            }
                String str = list.get(pos1);


            list.set(pos1, list.get(pos2));

            list.set(pos2,str);
        }



        System.out.println(list.toString());

return list;
    }

    public static void main(String[] args)
    {
ArrayList<String> str = new ArrayList<>();
str.add("one");
str.add("two");
str.add("three");


ArrayList<String> modifiedStr = swap(str, 2,5);
        //System.out.println(modifiedStr.toString());
    }//end main
}
