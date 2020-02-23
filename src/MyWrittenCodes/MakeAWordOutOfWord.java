package MyWrittenCodes;

public class MakeAWordOutOfWord {
    public static void main(String[] args) {


        String str = "abcb";
        //int count = 0;
        String str1 = "b";
        for (int i = 0; i < str.length(); i ++){

                if (str.charAt(i)==str1.charAt(0)) {
                    System.out.println("there is character "+str.charAt(i));

                }else if(str.charAt(i) != str1.charAt(0)){
                    System.out.println("this character we don't want");
                }
                else {
                    System.out.println("there is no such a character");
                }
            }

        }

     }
