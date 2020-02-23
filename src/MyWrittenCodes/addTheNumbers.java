package MyWrittenCodes;

public class addTheNumbers {
    public static void main(String[] args) {
        int value = 1;
        int theSum = 0;
        int theSub = 0;
        int theMult = 1;
        double theDiv = 1;
        while (value <= 10) {
            theSum = theSum + value;
            theSub = theSub - value;
            theMult = theMult * value;
            theDiv = theDiv / value;

            value ++ ;


        }
        System.out.println("the sum of numbers from 1 to 10 equals = " + theSum);
        System.out.println("the sub of numbers from 1 to 10 equals = " + theSub);
        System.out.println("the multiplication of numbers from 1 to 10 equals = " + theMult);
        System.out.println("the division of numbers from 1 to 10 equals = " + theDiv);



    }

}
