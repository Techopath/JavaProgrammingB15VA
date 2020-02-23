package day_34_methodsPractice;
import java.util.*;
public class Drive {
    public static void main(String[] args) {
        //Method: drive
        drive("Tesla", 39);
        drive("Toyota", -1);
        drive("porch", 300);

        //Method: login
        login("student@cybertek.com", "cybertekb15");
        login("STUDENT@cybertek.com", "cybertekb15");
        login("STUDENT@cybertek.com", "b15");
        login("", "");
    }

    //method: drive
    //return : void

    public static void drive(String car, int speed) {

        if (speed < 0) {
            System.out.println("Invalid speed, cannot be negative. but physically negative speed means the other direction )");
        } else if (speed == 0) {
            System.out.println(car + " is not moving at " + speed + " mph");

        } else if (speed <= 55) {
            System.out.println(car + " is driving at " + speed + " mph");
        } else if (speed > 55 && speed < 200) {
            System.out.println(car + "car is speeding at " + speed + " mph");
        } else {
            System.out.println(car + "car is flying at " + speed + " mph");
        }
    }

    //    Method: login
    //    2 Params/input: String userName, String password
    //    return: void

    public static void login(String userName, String password) {
        if (userName.equalsIgnoreCase("student@cybertek.com")
                && password.equals("cybertekb15")) {
            System.out.println("Login Successful, Welcome to Cybertek!");
        } else {
            System.out.println("ERROR: Login Failed - Invalid credentials!");
        }
    }
}

