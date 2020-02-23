package replitExamples;
import java.util.*;
public class EqualsJavaPython_103 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
//        String str = "java is not python pythonjava Jaaava";

        int strLength = str.length();
        int countJava = 0;

        for (int i = 0; i < strLength-3; i++) {
            String java = str.substring(i, i+4) ;
            if(java.equals("java")) {

                countJava++;
            }


        }
        System.out.println(countJava);

        int countPython =0;

        for (int j = 0; j < strLength-5; j++) {
            String python= str.substring(j,j+6);
            if (python.equals("python")){
                countPython++;
            }
        }
        System.out.println(countPython);
        if (countJava == countPython){
            System.out.println(true);
        }else {
            System.out.println(false);
        }



    }
}
