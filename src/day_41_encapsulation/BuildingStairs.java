package day_41_encapsulation;

public class BuildingStairs {
    public static void main(String[] args) {
        Elevator elOne = new Elevator();
        elOne.goToFloor(2);

        elOne.goToFloor(0);

        elOne.goToFloor(5);
        elOne.goToFloor(10);
        elOne.goToFloor(5);

    }
}
