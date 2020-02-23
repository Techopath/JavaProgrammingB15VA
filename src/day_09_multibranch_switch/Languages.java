package day_09_multibranch_switch;
/*1 -> English - Hello!
2->Spanish - Hola!
3 -> French - Bonjour!
4- > Russian - Salam!
5 -> Arabic - Privet!
6- > Turkish - Merhaba!
any other : -> Ciao
Create a class named Languages
add main method
declare int variable option and assign 2.
using multi branch if statements check the value of option.

*/
import java.util.Scanner;
public class Languages {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1-7 for preferred language!");
    int option = scan.nextInt();//int option =5;
    String str = "";
    String str1 = "";
    if (option == 1) {
        str = "English";
        str1 = "Hello";
        //System.out.println("Hello!");
    }else if (option == 2){
        str = "Spanish";
        str1 = "Hola";
    }else if (option == 3){
        str = "French ";
        str1 = "Bonjour";
    }else if (option == 4){
        str = "Arabic";
        str1 = "Salam";
    }else if (option == 5){
        str = "Russian";
        str1 = "Privet";

    }else if (option == 6){
        str = "Turksih";
        str1 = "Merhaba";
    }else {
        str = "Tajik but will be added soon!";
        str1 = "Salom";
    }
    System.out.println("Language is " +str + "\n Greeting is " +str1);
    }


}
