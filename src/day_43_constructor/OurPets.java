package day_43_constructor;

public class OurPets {
    public static void main(String[] args) {
        Pet shrek = new Pet();
        shrek.type = "dog";
        shrek.name ="Shrek";

        System.out.println(shrek.getType());
        System.out.println(shrek.getName());
        System.out.println(shrek.toString());

        Pet mimi = new Pet();

        mimi.setPetInfo("Buldog","Bars");

        System.out.println(mimi.getType());
        System.out.println(mimi.getName());
        System.out.println(mimi.toString());

        shrek.speak();
        mimi.speak();


        Pet myPet = new Pet();
        myPet.setPetInfo("dog","Barsik");
        System.out.println(myPet.toString());
        myPet.speak();

        Pet laika = new Pet("dog", "Laika");
        System.out.println(laika.toString());
        Pet simba = new Pet("lion", "Simba");
        System.out.println(simba.toString());

    }
}
