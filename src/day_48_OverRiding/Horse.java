package day_48_OverRiding;

public class Horse extends Animal {
    public void speak(){
        System.out.println("Horse making sound ....");
    }

    @Override
    public void move(){
        System.out.println("Horse is running fast ...galloping");
    }
    @Override
    public void eat(String food){
        System.out.println("Horse eats "+food+" ...");
    }
}
