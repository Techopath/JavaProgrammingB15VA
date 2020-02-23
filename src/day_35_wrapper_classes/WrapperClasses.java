package day_35_wrapper_classes;

public class WrapperClasses {

    public static void main(String[] args) {
        Integer num = new Integer(10);
        Integer num2 = 33;
        System.out.println("num2 = " + num2);
        System.out.println("num = " + num);

        int num3 = 44; //no behaviour

        String strNum = num.toString();
        System.out.println("strNum = " + strNum);
        //Integer class static method
        Integer.sum(2,3);
        System.out.println(Integer.sum(5,3)); //sums up the numbers

        Integer.max(5,8); //prints out largest of two
        System.out.println(Integer.max(10,2));

        Integer.min(3,5);
        System.out.println(Integer.min(5,-1));

      System.out.println(Integer.MIN_VALUE);
      System.out.println(Integer.MAX_VALUE);

      System.out.println(Long.MIN_VALUE);
        /*
        first larger than second -> 1
        equals ->0
        first is less than the second
         */

        System.out.println(Integer.compare(10,5));
        System.out.println(Integer.compare(10,10));
        System.out.println(Integer.compare(2,5));

        //convert a string into int

        String countStr = "3456";
        int intCount = Integer.parseInt(countStr);
        int intCount2 = Integer.valueOf(countStr);

        System.out.println("intCount = " + intCount);
        System.out.println("intCount2 = " + intCount2);

        int sum = intCount+intCount2;
        System.out.println("sum = " + sum);



    }

}
