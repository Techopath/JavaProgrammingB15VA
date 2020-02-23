package day_19_for_loop2;

public class HowManyLetters {
    public static void main(String[] args) {
        String str = "java loops are fun";
        int count =0;
        char myChar = 'a';
        for (int i=0; i<str.length(); i++){//i<=str.length()-1;
            //System.out.println(str.charAt(i));
            if (str.charAt(i) == myChar){
            count ++;
                System.out.println(myChar +" found at " + i);

            }
            }
            System.out.println("there are " +count +" " +myChar +" characters in the sentence");

        }
    }
