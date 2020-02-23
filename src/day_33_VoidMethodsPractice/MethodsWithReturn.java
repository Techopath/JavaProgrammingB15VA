package day_33_VoidMethodsPractice;

public class MethodsWithReturn {
    public static void main(String[] args) {

        //System.out.println(getName());//also possible to use this way
        String myName= getName();//also you can assign it to another variable of type mentioned in our method.
        System.out.println("my name: "+myName);

        //call the method giveMe5Dollars here

        int wallet = giveMe5Dollars();
        System.out.println("How much in wallet? - $"+wallet);
        System.out.println(giveMe5Dollars());
        ///length method
        String str = "java";
        int len = str.length();
        System.out.println(len);
        //toUpperCase method
        System.out.println(str.toLowerCase());
        String upper = str.toUpperCase();
        System.out.println("upper: "+upper);
        //
        //System.out.println(fiveDollars()); //it will not return anything when void is used.
        fiveDollars();


    }
    public static void fiveDollars(){
        int dollars = 5;


    }

    public static int giveMe5Dollars(){
        int dollar =5;
        return dollar;
    }

   public static String getName(){

       return "Muhammad";
   }
}
