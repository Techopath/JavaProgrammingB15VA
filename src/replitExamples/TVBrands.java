package replitExamples;

import org.w3c.dom.ls.LSOutput;

public class TVBrands {

    public static void main(String[] args) {
        TV lg = new TV();
        System.out.println(lg.getBrand());
        System.out.println(lg.getChannel1());
        System.out.println(lg.getVolumLevel());


        lg.isOn();
        lg.turnOn();
        lg.setChannel1(8);
        lg.setChannel1(0);

        lg.channelDown();
        lg.channelDown();



    }

}
