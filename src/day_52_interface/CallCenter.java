package day_52_interface;

public class CallCenter {
    public static void main(String[] args) {
        WhatsApp whatsApp = new WhatsApp();
        whatsApp.launch();
        whatsApp.allOSCompatible = true;
        whatsApp.isFree = true;
        whatsApp.name = "WhatsApp";
        whatsApp.call("Mr. Nadir");
        whatsApp.videoCall();
        whatsApp.sendMessage("Hi there");


    }
}

