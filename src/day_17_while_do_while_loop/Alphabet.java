package day_17_while_do_while_loop;

public class Alphabet {
    public static void main(String[] args) {
        char letter = 'a';
       // System.out.println("letter = " +letter);
      //  letter ++;
      //  System.out.println("letter = " +letter);
    while (letter <= 'z'){
        System.out.print(letter +" ");
        letter ++;
    }
       ////////////////////////////
        System.out.println();
        char letterReverse = 'z';
        while (letterReverse >= 'a'){
            System.out.print(letterReverse +" ");
        letterReverse --;

        }
        //////////////////////
        System.out.println();
        char myLetter = 'A';
        String alphabet = "";
        while (myLetter<='Z'){
            //attach/concatenate myLetter1 to alphabet1
            alphabet = alphabet + myLetter;
            System.out.println(alphabet + " ");

            myLetter ++;
        }
        //////////////////////
        System.out.println();
        char myLetter1 = 'A';
        String alphabet1 = "";
        int count = 0;
        while (myLetter1<='Z'){
            //attach/concatenate myLetter1 to alphabet1
            alphabet1 = alphabet1 + myLetter1;
            count ++;
            System.out.println(alphabet1 + " ");
            if (count >3){
                System.out.println(myLetter1 +" is " + count +"th letter");

            }else {
                System.out.println(myLetter1 +" is positioned in " + count);
            }

            myLetter1 ++;

        }

        int numbers = 20;
        while (numbers >=0 ){

            if(numbers >= 10 && numbers <= 15) {
                System.out.print(numbers + " ");
            }else{
                System.out.println("\nNot in range - " + numbers);
            }

            numbers --;




        }





    }
}
