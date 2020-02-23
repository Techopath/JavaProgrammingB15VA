package day_07_operators_casting_boolean_if;

public class TypeCasting {
    public static void main(String [] args) {
        //Automatic casting --implicit casting
        //from small to large
        byte b = 100;
        short sh = b; // sh =(short)b; is also possible;
        int i = sh;
        System.out.println("byte: " + b);
        System.out.println("Short : " + sh);
        System.out.println("i: " + i);
        int n = 1234567;
        long l = n; // no need for L at end
        System.out.println("n: " + n);
        System.out.println("l:" + l);
        double d = n; //adds .0 decimal
        System.out.println("d: " + d);
        ///Explicit casting: parantethis before variable name and type.
        int n2 = 120;
        byte b2 = (byte) n2;
        System.out.println("n2: " + n2);
        System.out.println("b2: " + b2);
        double price = 120.44;
        int intPrice = (int) price;
        System.out.println("price: " + price);
        System.out.println("intPrice: " + intPrice);

        int num3 = 1000;
        byte b3 = (byte) num3; //gives randomly numbers.
        System.out.println("b3: " + b3);

        //convert in to string
        int num5 = 3456; //
        //String str = (String)num5: cannot cast
        String str = num5 + "";
        System.out.println("num5: " + num5);
        System.out.println("str: " + str);
    }
}