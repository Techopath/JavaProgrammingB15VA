package replitExamples;
import java.util.Scanner;
public class GetSandwich_102 {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String str = scan.next();
//                    0123456789101112
        String str = "xxbreadhgbreadcxcx";
        int n = 5;
        String prefix = "";

        String word = "";

        for (int i = 0; i < str.length()-4 ; i++) {
if (str.substring(i,i+5).equals("bread")){
    prefix =str.substring(i,i+5);
    System.out.println(prefix);

}
        }
       // System.out.println(str.substring(5,str.length()-5 ));


        int count = 0;
        for (int i=0; i<str.length()-n; i++){
            if (str.substring(i, i+n).equals(prefix)){
                count ++;
                System.out.println(str.indexOf(str.substring(i,i+n)));
            }
        }
        System.out.println(count);
        if (count>1){
            for (int k = 0; k < str.length(); k++) {
                //word = str.substring(k+n,str.length()-n);
            }

            System.out.println(word);
        }else if(count<=1){
            System.out.println("nothing");
        }




    }
}
