package MyWrittenCodes;

public class countLetters {
    public static void main(String[] args) {

    String str = "AAAABBBCCCDDD";
    String nonduplicate = "";//output should be "ABCD"
        for (int i = 0; i < str.length() ; i++) {
        if(!nonduplicate.contains(""+ str.charAt(i))){
            nonduplicate += ""+str.charAt(i);
        }
    }
        System.out.println(nonduplicate);// add numbers to the characters , output should be A3B2C5D

        int count =0;
         for (int i = 0; i < str.length() ; i++) {
        count = 0;
        for (int j = 0; j < nonduplicate.length(); j++) {
            if(str.charAt(i) == str.charAt(j)){
                count+=i;
            }
        }
        System.out.print(nonduplicate + count);
    }
}
}
