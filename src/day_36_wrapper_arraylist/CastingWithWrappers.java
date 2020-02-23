package day_36_wrapper_arraylist;

public class CastingWithWrappers {
    public static void main(String[] args) {
        //casting primitives

        int intValue = 123;
        double doubleValue = intValue; //implicit (automatic) casting

        System.out.println("intValue = " + intValue);
        System.out.println("doubleValue = " + doubleValue);

        Integer wrapperInt = Integer.valueOf(100);
        // Double wrapperDouble = wrapperInt; //Error: cannot cast among wrappers




    }
}
