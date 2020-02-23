package day_48_OverRiding;

public class Cat extends Animal{

    public void speak(){
        System.out.println("Cat is saying MEAOW MEOW ...");
    }
    //override move
    public void move(){
        System.out.println("Cat is moving upstairs ...");
    }

    public void jump(){ //not override method
        System.out.println("method jump is not override, for it to be override needs to be present in parent(super class) too.");
    }
    public void eat(String food){
        System.out.println("Cat eats "+food);
    }

}
