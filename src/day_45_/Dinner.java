package day_45_;

public class Dinner {

    public static int pizzaSlices = 8; //we have static then it is shared

    public void takeASlice(){
        pizzaSlices --;
    }

    public void takeASlice(int count){
        pizzaSlices -= count;
    }



}
