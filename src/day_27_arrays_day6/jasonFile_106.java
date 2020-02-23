package day_27_arrays_day6;
import java.util.*;
public class jasonFile_106 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String json = scan.nextLine();


String [] jsonarray = json.split(",");
        int start = jsonarray[1].indexOf("firstName");
        int end = jsonarray[2].indexOf("lastName");



        System.out.println("First name: "+jsonarray[1].substring(start+11,jsonarray[1].length()-1));
        System.out.print("Last name: "+jsonarray[2].substring(end+12,jsonarray[2].length()-1));


    }
}
