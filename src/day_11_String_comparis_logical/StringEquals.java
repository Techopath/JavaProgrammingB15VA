package day_11_String_comparis_logical;

public class StringEquals {
    public static void main(String[] args) {
        String str ="Java";
        String str2 = new String("java");
        //compare using ==
        System.out.println(str == "java");
        System.out.println(str2 == "java");

    //compare using .equals()
        System.out.println(str.equals("java"));
        System.out.println(str2.equals("java"));
        System.out.println(str2.equals("Java"));
        //compare using .equalsIgnoreCase
        System.out.println(str.equalsIgnoreCase("JAVA"));
        System.out.println(str2.equalsIgnoreCase("jAVA"));
        System.out.println("--------");
        //
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println(str.equals(str2));
        //str ==str2
        System.out.println(str == str2);
    }
}
