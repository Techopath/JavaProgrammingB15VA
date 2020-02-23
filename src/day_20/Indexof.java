package day_20;

public class Indexof {
    public static void main(String[] args) {
        String str = "Java is fun";
        //str = str.toLowerCase();
        char letter = 'q';
        //position of letter - assume not there and assign -1
        int index = -1;
        //loop from first character until last character
        for (int i = 0; i<=str.length()-1; ++i){//starts from first letter i=0; ++i and i++ both okay.
            //System.out.println(str.charAt(i));
            if (str.charAt(i) == letter){
                index = i;
               // break;
                System.out.println(letter +" was found at " + index);
            }


        }
        System.out.println("index is at " +index);
    }
}
