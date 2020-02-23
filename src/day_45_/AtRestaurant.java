package day_45_;

public class AtRestaurant {

    public static void main (String [] args){
        Dinner Mom = new Dinner();
        Dinner Dad = new Dinner();
        Dinner kid = new Dinner();
// if we have static, use class name to print out slices:
      //  System.out.println("Total slices: "+Dinner.pizzaSlices);
        kid.takeASlice();
        Mom.takeASlice();
        Dad.takeASlice(2);
    //    System.out.println("Total slices: "+Dinner.pizzaSlices); //if data type is not static this will be red

        System.out.println("kid: "+kid.pizzaSlices); //after they took their pizzas, kid sees 4 slices left
        System.out.println("Mom: "+ Dad.pizzaSlices);//mom sees 4 slices left
        System.out.println("Dad: "+Mom.pizzaSlices);//dad sees 4 slices left

        Mom.takeASlice(); //takes 1 slice
        kid.takeASlice(2); //takes 2 slices
        Dad.takeASlice();//takes 1 slice

        System.out.println("kid: "+kid.pizzaSlices); //sees 0 slices left
        System.out.println("Mom: "+ Dad.pizzaSlices);//sees 0 slices left
        System.out.println("Dad: "+Mom.pizzaSlices);//sees 0 slices left

        Dad.pizzaSlices = 8; //dad orders 8 more slices

      //  System.out.println("Total slices: "+Dinner.pizzaSlices);

        System.out.println("kid: "+kid.pizzaSlices);  //sees 8 slices
        System.out.println("Mom: "+ Dad.pizzaSlices); //sees 8 slices
        System.out.println("Dad: "+Mom.pizzaSlices);  //sees 8 slices



    }
}
