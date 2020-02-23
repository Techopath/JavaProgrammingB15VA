package day_27_arrays_day6;

public class Encryption {
    public static void main (String [] args){
                        // 0123456789....
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String encrypted= "zyxwvutsrqponmlkjihgfedcba";
        String letter ="a";
        //encrypt letter
        //find the index of letter 'a' in alphabet
        int idx = alphabet.indexOf(letter);
        System.out.println(idx);
        //read character at same index from encrypted
        System.out.println(letter +"=>"+encrypted.charAt(idx));

        //====================
        String word= "java";
        //instructors way
        char first = word.charAt(0);
        System.out.println(first);
        char second = word.charAt(1);
        char third = word.charAt(2);
        char four = word.charAt(3);
//        System.out.println(second);
//        System.out.println(four);

        int i1 = alphabet.indexOf(first);
        int i2 = alphabet.indexOf(second);
        int i3 = alphabet.indexOf(third);
        int i4 = alphabet.indexOf(four);

        char encr1 = encrypted.charAt(i1);
        char encr2 = encrypted.charAt(i2);
        char encr3 = encrypted.charAt(i3);
        char encr4 = encrypted.charAt(i4);

        String encWord = ""+encr1+encr2+encr3+encr4;
        System.out.println(encWord);
        ////////////my way

        int jdex = alphabet.indexOf("j");
        int adex = alphabet.indexOf("a");
        int vdex = alphabet.indexOf("v");

//        System.out.println(word.charAt(0)+"=>"+encrypted.charAt(jdex));
//        System.out.println(word.charAt(1)+"=>"+encrypted.charAt(adex));
//        System.out.println(word.charAt(2)+"=>"+encrypted.charAt(vdex));
//        System.out.println(word.charAt(3)+"=>"+encrypted.charAt(adex));
        //
        System.out.println(word.charAt(0)+""+word.charAt(1)+""+word.charAt(2)+""+word.charAt(3)
                +"=>"+encrypted.charAt(jdex)+encrypted.charAt(adex)+encrypted.charAt(vdex)+encrypted.charAt(adex));

        System.out.println();
        //task 1. assign a new word and encrypt each letter using a for loop
        System.out.println();
        String word2 = "muhammad";
        String encryptedWord = "";

        for (int n=0; n<word2.length(); n++){
            //1.st step read a letter from word2 -index n
            char ch = word2.charAt(n);
            //2.nd step find the index of ch in alphabet
            int ix = alphabet.indexOf(ch);
            //3.rd step read the letter at position index from encrypted and store it into char enc
            char enc = encrypted.charAt(ix);
            // 4.th step write each of enc into String encryptedWord
            encryptedWord = encryptedWord+ enc;

        }
        System.out.println(word2+"=>"+encryptedWord);
//task 2
        //declare word3 and assign some enrypted message

        //decrypt it!

        String word3 = "dliow";
        String decription = "";

        for (int b = 0; b <word3.length() ; b++) {
            char myLetter = word3.charAt(b);
            System.out.println(myLetter);
            int indexOfmyLetter = encrypted.indexOf(myLetter);
            char myOtherLetters = alphabet.charAt(indexOfmyLetter);
            decription = decription + myOtherLetters;


        }
        System.out.println(decription);
        }
    }
