package day_49_OverRiding_final;

import java.lang.management.LockInfo;

public class PetTest {
    public static void main(String[] args) {
        Pet myPet = new Pet();
        myPet.eat("food");

        Lion myLion = new Lion();
        myLion.eat("meat", 5);
    }
}
