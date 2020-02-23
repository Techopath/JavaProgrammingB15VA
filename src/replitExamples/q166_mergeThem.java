package replitExamples;

public class q166_mergeThem {
    public static void main(String[] args) {
        String str1 = "123458787878787";
        String str2 = "abcdefgh";

        System.out.println(mergeStrings(str1,str2));

    }
    public static String mergeStrings(String one, String two) {
        String mergeOfStrings = "";
        int countStr1 =0;
        int countStr2 =0;
        for (int i = 0; i < one.length(); i++) {

            mergeOfStrings = mergeOfStrings+one.charAt(i);
            countStr1 ++;
            for (int j = countStr2; j <two.length() ; j++) {
                countStr2++;
                if (countStr1 ==countStr2){
                    mergeOfStrings = mergeOfStrings+two.charAt(j);
                    break;

                }

            }
        }
       if(two.length() >one.length()){
           mergeOfStrings = mergeOfStrings + two.substring(countStr2);
       }else{
           mergeOfStrings =mergeOfStrings+one.substring(countStr1);
       }

return mergeOfStrings;
    }
}
