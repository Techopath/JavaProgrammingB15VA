package OfficeHoursMira;

public class alphabeticChar {
    public static void main(String[] args) {
        /*enter an alphabetic char and check if it is upper case or lower case
        * */
        char alphChar = 'G';
        //a-z lowercase ....A-Z uppercase
        if (alphChar >='a' && alphChar <='z'){
            System.out.println("char is lowercase");
        }else if(alphChar >= 'A' && alphChar <='Z') {
            System.out.println("char is Upper case");
        }else {
            System.out.println("Char is not alphabetical");
        }
    }
}
