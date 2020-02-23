package day_53_review_poly_intro;

public class IPhone extends AppleDevice implements CodeAble, WearAble {
    String model;


    public void navigation(){

        System.out.println(name + " model " +model + " is used well for navigation. ");

    }
    @Override

    public void use(){
        System.out.println(name + " model "+model + " used to call, text, play games, flipGrid, receive call");
    }

    @Override
    public void code(){

        System.out.println(name +" model " +model + " can be used to code java in repl.it, coding ");

    }

    @Override
    public void wear(){
        System.out.println(name + " model "+model+" can be wearable on arms using special case");
    }
}
