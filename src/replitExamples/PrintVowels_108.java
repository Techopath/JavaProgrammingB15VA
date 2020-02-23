package replitExamples;
import java.util.*;
public class PrintVowels_108 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        char [] vowels = {'a', 'i','o','u','e'};
        int length = word.length();
        int count =0;
        String vowelletters = "";
        String onlyThese ="";
        for (int i=0; i<length;i++){
            for (int j=0; j<vowels.length;j++){
                if (word.charAt(i) == vowels[j]){
                 //   System.out.print(word.charAt(i));
                    vowelletters = vowelletters+word.charAt(i);
                    count ++;
                }
            }

//            if (word.charAt(i) =='a' || word.charAt(i) =='i' || word.charAt(i) =='o' || word.charAt(i) =='u' ||word.charAt(i) =='e'){
//                System.out.print(word.charAt(i));
//            }
        }
        System.out.println(vowelletters);

        for (char k = 0; k<=vowelletters.length()-1;k++){
            String temp = vowelletters.charAt(k)+"";
            if (!onlyThese.contains(temp)){
                onlyThese = onlyThese + temp;
            }

        }
        System.out.print("unrepeated vowels: "+onlyThese);

        System.out.println();
        System.out.println("there are "+count +" vowel letters repeated");
    }

}
