package stackflow;
import java.util.*;
public class UniqueNumbers {

    public static void main(String[] args) {
        int[] test = {1, 2, 4, 5, 10, 30, 20, 1};
        int num = numUnique(test);
        System.out.println(num);
    }
    public static int numUnique(int[] list){
        int count= 0;
        int fin =list.length;
        Arrays.sort(list);
        for (int i = 0; i<=list.length; i++){
            if(list[i]==list[i-1])
                count++;
        }
        return fin-count;
    }


}
