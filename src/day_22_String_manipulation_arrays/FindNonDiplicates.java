package day_22_String_manipulation_arrays;

public class FindNonDiplicates {
    public static void main (String [] args){
        String str = "muhammad";
        String unique = "";
        for (int i = 0; i < str.length(); i++) {
            char outerLetter = str.charAt(i);
            System.out.println("checking - "+outerLetter);
            int count =0;//reset to zero each time to check if duplicates found
            for (int j = 0; j < str.length(); j++) {
                char innerLetter = str.charAt(j);
                //System.out.println("Comparing Inner loop letter with outerLetter: " + innerLetter);
                if ( innerLetter==outerLetter && i!=j){
                    System.out.println(outerLetter+" has duplicate");
                    count ++;
                }
            }
            if (count == 0){
                System.out.println(outerLetter +" has no duplicate. ");

            }else{
                System.out.println(outerLetter +" has Duplicate. ");
            }
        }//outer loop ends here
    }
}
