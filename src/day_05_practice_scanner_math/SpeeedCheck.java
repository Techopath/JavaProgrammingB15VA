package day_05_practice_scanner_math;

public class SpeeedCheck {
    public static void main(String [] args ){
        int speedLimit = 55;
        int currentSpeed = 90;
        int overLimit = currentSpeed - speedLimit;
        System.out.println("you are " +overLimit + " mph faster than the posted speed limit");
    }
}
