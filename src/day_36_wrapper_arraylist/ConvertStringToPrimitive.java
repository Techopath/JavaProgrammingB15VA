package day_36_wrapper_arraylist;

public class ConvertStringToPrimitive {
    public static void main(String[] args) {

        // boolean, character, byte, short, integer, long, float, double

        boolean b1 = Boolean.parseBoolean("true");

        char ch  = "a".charAt(0); //work around for string > char. character class does not have parse method.

        byte byteValue = Byte.parseByte("100");

        short shortValue = Short.parseShort("1000");

        int intValue = Integer.parseInt("123456");

        long longValue = Long.parseLong("1232465465487");

        double doubleValue = Double.parseDouble("12345.5600");

        float floatValue = Float.parseFloat("32454.45");



        String str = "123";
        int integer =Integer.parseInt(str);

        if (integer < 200){
            System.out.println("OutOfBudgetsException");
        }else{
            System.out.println("lets buy it");
        }

        System.out.println("hello".toUpperCase());
    }
}
