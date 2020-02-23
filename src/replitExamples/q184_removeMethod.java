package replitExamples;
import java.util.*;
public class q184_removeMethod {
    public static void main(String[] args) {
        ArrayList<Double> doubles = new ArrayList<>(Arrays.asList(0.1,0.2,1.0,5.2,4.3,1.4,0.2,8.0));
        test(doubles);


    }



    public static void test(ArrayList<Double> dubs)
    {
        int count =0;
        //write code here
        for (int i = 0; i <=dubs.size(); i++) {
            dubs.remove(i);
            i--;
            count ++;

            if (count ==2){
                System.out.println(dubs.toString());
                break;
            }
        }






        }




    }
