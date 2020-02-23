package day_53_review_poly_intro;

public class AppleWatch extends AppleDevice implements WearAble{

    public int series;




    public void countSteps(){
        System.out.println("AppleWatch "+series+" - counting steps ...");
    }

    @Override
    public void use(){ //from AppleDevice abstract class
        System.out.println("AppleWatch "+ series +" - using to check time, heartRate, exercise");
    }
    @Override
    public void wear(){

        System.out.println("AppleWatch "+series+" - wear in wrist, neck ...");

    }
    public AppleWatch(){

        System.out.println(name + " series "+series+ " counting each step ...");
    }
}
