package day_45_;
import day_46_inheritance_intro.Person;
import day_46_inheritance_intro.Student;

import java.util.*;
public class Vehicle {
    private /*static /*added*/String model;
    public static int numberOfVehicle=0;

    public Vehicle(){
        System.out.println("Parking an unknown vehicle");
        numberOfVehicle++;
    }
    public Vehicle(String model) {
        System.out.println("Parking "+ model);
        this.model = model;
        numberOfVehicle++;
    }

    public void leaveParkingLot(){
        numberOfVehicle --;
    }


    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                '}';
    }

}
