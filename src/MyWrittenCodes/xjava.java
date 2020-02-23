package MyWrittenCodes;

import javax.swing.*;

public class xjava {
    public static void main(String[] args) {
        String str = "xxjavaxx";

       int length = str.length();
        for (int i = 0; i < length-3; i++) {
            System.out.println(str.substring(i,i+4));

        }
        if (str.substring(0,4).equals("java") || str.substring(1,5).equals("java")){
            System.out.println(true);
        }else{
            System.out.println("there is no java starting at 0 or 1 index");
        }

    }

}
