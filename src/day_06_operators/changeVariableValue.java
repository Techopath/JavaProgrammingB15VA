package day_06_operators;

public class changeVariableValue {
    public static void main (String [] args) {

        /*int total = 50;
        int num = 10;
        System.out.println(total);
        System.out.println(total - num); //here the result is 40 but total is still 50.
        total = total - num; //total value is updated with a new value.
        System.out.println(total);
        int t= total +2;
        System.out.println(t); //output is 42 not 52.
       */
        int students = 50;
        System.out.println("Students: " + students);
        students = students + 10;
        System.out.println("Students: " + students);
        students = students - 2;
        System.out.println("students left the class: " + students);
        int b12Students = 3;
        students = students + b12Students;
        System.out.println("Students: " +students);

        //
        double balance = 250.0;
        double shoePrice = 75.5;
        System.out.println("Initial balance: " +balance);
        balance = balance - shoePrice;
        System.out.println("Updated balance: " +balance);
        //
        double shirtPrice = 0.5 * shoePrice;
        balance = balance - shirtPrice;
        System.out.println("There is a change in your balance. \nNewer balance: " +balance);


    }
}
