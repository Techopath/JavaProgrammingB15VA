package day_48_OverRiding;

public class AnimalKingdom {

    public static void main(String[] args) {
        Animal animal = new Animal(); //object created for animal

        animal.speak();
        animal.move();


        Cat cat = new Cat(); //object created for cat
        cat.speak();
        cat.move();
        cat.jump();


        Horse horse = new Horse();
        horse.speak();
        horse.move();

        Wolf wolf = new Wolf();
        wolf.speak();
        wolf.move();

        animal.eat("depends on animal type");
        wolf.eat("sheep meat");
        cat.eat("mice");
        horse.eat("grass");


    }
}
