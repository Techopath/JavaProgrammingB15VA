package day_48_OverRiding;

public class Wolf extends Animal {

    public void speak(){
        System.out.println("Wolf is bluchak kashidestay");

    }
    public void move(){
        System.out.println("Wolf is moving forward");
    }
    @Override
    public void eat(String food){
        System.out.println("Wolf is eating "+food+" ...");
    }

}
