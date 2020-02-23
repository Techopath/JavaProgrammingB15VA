package day_07_operators_casting_boolean_if;

public class IncrementDecrementOperators {
    public static void main(String [] args) {
        int myNumber = 100;
        System.out.println("My number: " + myNumber); //100
        //----------Increment------------------------------------------
        myNumber ++ ; //increment by 1
        System.out.println("Mynumber : " + myNumber); //101

        ++myNumber; // the same as myNumber ++;
        System.out.println("Mynumber: " + myNumber);// 102

        myNumber++; myNumber++; myNumber++;
        System.out.println("MyNumber: " +myNumber);
        //---------------------Decrement-------------------------------
        int booksToRead = 5;
        System.out.println("Books to read: " +booksToRead); //5
        booksToRead --;
        System.out.println("Books left to read: " +booksToRead);//4
        booksToRead --;
        System.out.println("Books left to read: " + booksToRead);//3
        booksToRead --;
        System.out.println("Books left to read: " +booksToRead);//2
        //-------------------------------------------------------------
        char letter = 'A';
        System.out.println("Letter: " +letter ); //65-A
        letter ++;
        System.out.println("Letter: " +letter);//66-B
        ++letter;
        System.out.println("Letter: " +letter);//67-C
        ++letter;
        System.out.println("Letter: " +letter);//68-D
        //---------------------------------------------------------------
        char myChar = '!';
        System.out.println("My char: " +myChar); // - !
        myChar ++;
        System.out.println("My char: " +myChar);// - "
        myChar += 10;
        System.out.println("My char: " +myChar); // - check corresponding character from ascii table
        //------------------------------------------------------------------
        int num1 = 3;
        System.out.println(num1); // num1 is 3
        int num2 = ++num1; //after we increase num1 by 1 and assign it to num2, both become 4.
        System.out.println(num1 +" "+ num2);
        System.out.println(num1); // num1 is already updated and its value is 4. no longer 3.

        //---------------------------------------------------------------------
        int n1 = 3;
        int n2 = n1++; //this is post increment ...n1 will be assigned to n2 and then n1 increases.
        System.out.println("n1:" +n1);
        System.out.println("n2:" +n2);










    }
}
