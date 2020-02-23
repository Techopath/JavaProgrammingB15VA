package day_41_encapsulation;

import java.awt.*;

public class BestBuyTVs {
    public static void main (String [] args){
        //Create TV object - "LG 1122, false, 5
        TV lg = new TV();
        //lg.brand = "LG 1122";
        //lg.isOn = false;
        //lg.channel = 5;
        lg.setTVInfo("LG 1122","off",5);
        System.out.println(lg.toString());
        System.out.println(lg);
        TV sm = new TV();
        sm.setTVInfo("Samsung 003", "on", 10);
        System.out.println(sm.toString());//text describing the object

        //test turnOn, turnOff methods

        System.out.println("LG: "+ lg.powerState);
        lg.turnOn();
        System.out.println("LG: "+lg.powerState);


        //
        System.out.println("samsung: "+sm.powerState);
        sm.turnOff();
        System.out.println("samsung: "+sm.powerState);

        //create a new object tv

        TV sony = new TV();
        System.out.println(sony.toString());
        sony.setTVInfo("Sony One", "on", 1);
        System.out.println(sony.toString());

        sony.channelUp();
        System.out.println(sony.toString());

        sony.setChannel(123);
        System.out.println(sony.toString());

        sony.channelDown();
        System.out.println(sony.toString());






    }
}
