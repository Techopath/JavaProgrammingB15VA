package day_53_polymorphism;

public class Dog extends Animal {

    public void speak(){ //we overRide speak()

        System.out.println("Dog is saying WOOF WOOF ");

    }

    public void hunt(){
        System.out.println("Dog is hunting duck ...");
    }
}
