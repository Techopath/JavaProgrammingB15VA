package day_06_operators;

public class shortHandOperators {
    public static void main(String [] args) {
        int cars = 15;
        System.out.println("Cars in parking lot: " +cars);//15
        cars = cars + 2;
        // cars +=2;
        System.out.println("Cars in parking lot: " + cars);//17
        cars += 3;
        System.out.println("cars in the parking lot: " + cars);//20

        cars = cars - 1;
        System.out.println("cars in the parking lot: " + cars); //19
        cars -= 2;
        System.out.println("cars in the parking lot: " + cars); //17

        cars *= 3; // cars = cars *3.
        System.out.println("cars in the parking lot: " +cars);//51


       /* Scanner input = new Scanner(System.in);
        System.out.println("choose a number for division: ");
        int n = input.nextInt();
        cars /= n;
        int r = cars%n;
        System.out.println("cars in the parking lot: " + cars + "| # of cars we dont know what happened: " +r);
*/

       String letters = "A";
       System.out.println("Letters: " +letters);
       letters = letters + "B";
       System.out.println("Letters: " +letters);
       letters += "CD"; //letters -= "CD" :will not work
       System.out.println("Letters: " +letters);

       int apples = 10;
       apples %= 3;
       System.out.println("Apples left: " +apples);


    }
}
