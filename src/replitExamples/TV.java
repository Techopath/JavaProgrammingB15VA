package replitExamples;
import java.util.*;
public class TV {
    int channel1 = 1;
    int volumeLevel = 1;
    boolean on = false;
    String brand = "undefined";

    public TV() {
        System.out.println("Creating TV object using no Args - constructor");


    }

    public TV(String brand) {
        System.out.println("Creating TV object using 1 arg - constructor");

    }

    public int getVolumLevel() {
        return volumeLevel;
    }

    public void setVolumLevel(int volumeLevel) {
        if(volumeLevel >=1 && volumeLevel <=7 && on == true){
            volumeLevel = volumeLevel;
        }else{
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }


    }

    public int getChannel1() {
        return channel1;
    }

    public void setChannel1(int channel1) {
        if(channel1 >0 && channel1 <=120)
        {
            channel1 = channel1;
        }else{
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        brand = brand;
    }

    public void channelUp() {
        channel1++;
    }

    public void channelDown() {
        channel1--;
    }

    public void volumeUp() {
        volumeLevel++;
    }

    public void volumeDown() {
        volumeLevel--;
    }

    public void isOn() {
        if (on == true) {
            System.out.println("Tv is already ON");
        } else {
            System.out.println("Tv is already OFF");
        }
    }

    public void turnOn() {
        if (on == false) {
            System.out.println("Turn the TV ON");

        }
    }

    public void turnOff() {
        if (on == true) {
            System.out.println("Turn OFF the TV");

        }

    }
}
