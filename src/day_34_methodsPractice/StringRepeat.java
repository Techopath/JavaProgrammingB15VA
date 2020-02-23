package day_34_methodsPractice;

public class StringRepeat {
    public static void main(String[] args) {
      //  System.out.println(repeatString("hi", 3, '@')); //not applicable in void methods
        repeatString("hello", 4,'&'); //we write just this way, and it still prints out the outcome
        repeatString("i work with java", 20, '#');

        String nStr = repeatStr("Congratulations. You did it",3,'!');
        System.out.println(nStr);
    }
    public static void repeatString(String word, int times, char delimiter){
        String newString ="";
        for (int i = 0; i < times; i++) {
            newString = word+delimiter;

            System.out.print(newString);
        }

        //newString = newString.substring(0, newString.length()-1);
        System.out.println(newString);

    }

    public static String repeatStr(String str, int time, char deli){

        String newWord = "";
        for (int i = 0; i < time; i++) {
            newWord =newWord + str+deli+" ";

        }
        return newWord;
    }
}
