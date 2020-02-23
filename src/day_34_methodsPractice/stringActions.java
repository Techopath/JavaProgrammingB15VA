package day_34_methodsPractice;

public class stringActions {
    public static void main(String[] args) {
        ///method: countCar
        char ch = 'a';
        int amount = countChar("my name is muhammad", ch);
        System.out.println("the char \""+ch+"\""+" is repeated "+amount +" times");
        System.out.println(""+countChar("", '@'));

        //call countChars and save return value into variable
       int countOfChars = countChar("class", 's');
        System.out.println("there are "+countOfChars+" s chars");

        //method countWords
        String str = "java is fun if you understand of fun things, otherwise it will be boring despite it is fun";
        int howManyWords= countWords(str);
        System.out.println(str +" has "+howManyWords+" words in it");
        System.out.println(countWords("java is fun!"));
        System.out.println(countWords(""));
        System.out.println("The sentence is empty with "+countWords("")+" words in it");
    }
    //Method name: countWords
    public static int countWords (String sentence){
        if (sentence.isEmpty()){
            return 0;
        }
          String [] sentenceSplit = sentence.split(" ");
         return sentenceSplit.length;

// using for loop we get the same result but the above code is enough to calculate what we expect

//        int count =0;
//        for (int i = 0; i < sentenceSplit.length; i++) {
//            if (sentenceSplit[i].length()>=2){
//                count ++;
//            } else if (sentenceSplit[i].length() ==1){
//                System.out.println(sentenceSplit[i]+" is one character not a word");
//            }
//
//        }
//        return count;

        //method: countChar


    }

    public static  int countChar (String Str, char ch){
        int count =0;
        for (int i = 0; i < Str.length(); i++) {
            if (Str.charAt(i) == ch){
               count ++;
            }

        }
        return count;

    }


}
