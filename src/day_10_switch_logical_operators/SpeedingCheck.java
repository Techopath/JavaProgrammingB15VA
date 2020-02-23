package day_10_switch_logical_operators;

public class SpeedingCheck {
    public static void main(String [] args){
        int currentSpeed =91;
        if (currentSpeed > 90){
            System.out.println("Jail Time!");

        }else if (currentSpeed > 80){
            System.out.println("Speeding ticket and points");
        }else if (currentSpeed >60){
            System.out.println("Warning!");

        }else {
            System.out.println("Keep driving anf thinking Java");
        }
    }
}
