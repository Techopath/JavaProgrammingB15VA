package replitExamples;
import java.util.*;
public class BuildARout_84 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();

        String rout = "";


        String [] atoD = {"A", "B","C","D", "A"};

            if (start =="A" && end =="B"){
               rout = rout +"right";
            }else if (start=="B" && end =="C"){
                 rout = rout + "down" +">";

            }


        System.out.println(rout);

    }
}
