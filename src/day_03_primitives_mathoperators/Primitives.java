package day_03_primitives_mathoperators;

public class Primitives {
    public static void main(String [] args) {
    byte byteValue =35; //up to 3 decimals but at most 127
    short shortValue = 21121; //up to 5 decimals
    int intValue = 1205468129; //up to 10 decimals
    long longValue = 1000000000000000000L; //up to 19 decimals - 10^18
    float floatValue = 234.34F; //
    double doubleValue = 6754.50D; //D is optional
    char charValue = 'M'; //single character inside single quote
    boolean booleanValue = true; //true or false
        //for larger numbers
    //BigInteger bigintegerValue = 4;
    //BigDecimal bigdecimalValue= 45454;
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue);
        System.out.println("boolean: " + booleanValue);
        //char letter = 65; //same as char letter = 'A';
        //System.out.println(letter);

     }
}
