package day_53_polymorphism;

public class AnimalObjects {

    public static void main(String[] args) {
        //Animal animal = new Animal(); //not polymorphism
        /*if we put a sub class to the right side of Animal object we make polymorphism*/

        Animal animalObj = new Dog(); //polymorphic expression
        //animalObj.hunt(); //hunt is not accessible,  we can only access data type of Animal.
        animalObj.name = "Barsik";
        animalObj.type = "dog";

        animalObj.speak();


    }
}
